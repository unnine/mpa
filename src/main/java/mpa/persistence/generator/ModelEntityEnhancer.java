package mpa.persistence.generator;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;

import java.util.Optional;
import java.util.StringJoiner;

public class ModelEntityEnhancer implements ModelEnhancer {

    @Override
    public void enhance(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        toEntity(topLevelClass);
        markId(topLevelClass, introspectedTable);
        addGetterSetter(topLevelClass, introspectedTable);
        addEqualsAndHashCodeMethods(topLevelClass, introspectedTable);
    }

    private void toEntity(TopLevelClass topLevelClass) {
        topLevelClass.addImportedType("mpa.persistence.entity.annotation.Entity");
        topLevelClass.addAnnotation("@Entity(name = \"" + topLevelClass.getType().getShortName() + "\")");
    }

    private void markId(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        for (IntrospectedColumn id : introspectedTable.getPrimaryKeyColumns()) {
            findIdField(topLevelClass, id.getJavaProperty()).ifPresent(f -> {
                topLevelClass.addImportedType("mpa.persistence.entity.annotation.Id");
                f.addAnnotation("@Id");
            });
        }
    }

    private Optional<Field> findIdField(TopLevelClass topLevelClass, String idFieldName) {
        for (Field field : topLevelClass.getFields()) {
            if (field.getName().equals(idFieldName)) {
                return Optional.of(field);
            }
        }
        return Optional.empty();
    }

    private void addGetterSetter(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        boolean hasSingleId = introspectedTable.getPrimaryKeyColumns().size() == 1;
        if (hasSingleId) {
            IntrospectedColumn id = introspectedTable.getPrimaryKeyColumns().get(0);
            addGetMethod(topLevelClass, id);
            addSetMethod(topLevelClass, id);
        }
    }

    private void addGetMethod(TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn) {
        if ("id".equalsIgnoreCase(introspectedColumn.getJavaProperty())) {
            return;
        }
        Method method = new Method("getId");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(introspectedColumn.getFullyQualifiedJavaType());
        method.addBodyLine("return this." + introspectedColumn.getJavaProperty() + ";");
        topLevelClass.addMethod(method);
    }

    private void addSetMethod(TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn) {
        if ("id".equalsIgnoreCase(introspectedColumn.getJavaProperty())) {
            return;
        }
        Method method = new Method("setId");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.addParameter(toParameter(introspectedColumn));
        method.addBodyLine("this." + introspectedColumn.getJavaProperty() + " = " + introspectedColumn.getJavaProperty() + ";");
        topLevelClass.addMethod(method);
    }

    private Parameter toParameter(IntrospectedColumn introspectedColumn) {
        return new Parameter(introspectedColumn.getFullyQualifiedJavaType(), introspectedColumn.getJavaProperty());
    }

    private void addEqualsAndHashCodeMethods(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        boolean emptyId = introspectedTable.getPrimaryKeyColumns().isEmpty();
        if (emptyId) {
            return;
        }
        topLevelClass.addImportedType("java.util.Objects");
        addEqualsMethod(topLevelClass, introspectedTable);
        addHashCodeMethod(topLevelClass, introspectedTable);
    }

    private void addEqualsMethod(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        Method method = new Method("equals");
        String typeName = topLevelClass.getType().getShortName();

        method.addAnnotation("@Override");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("boolean"));
        method.addParameter(new Parameter(new FullyQualifiedJavaType("Object"), "o"));
        method.addBodyLine("if (this == o) return true;");
        method.addBodyLine("if (o == null) return false;");
        method.addBodyLine("if (getClass() != o.getClass()) return false;");
        method.addBodyLine(typeName + " other = (" + typeName +  ") o;");

        StringJoiner bodyLine = new StringJoiner(" && ", "return ", ";");
        for (IntrospectedColumn id : introspectedTable.getPrimaryKeyColumns()) {
            bodyLine.add("Objects.equals(" + id.getJavaProperty() + ", other." + id.getJavaProperty() + ")");
        }
        method.addBodyLine(bodyLine.toString());

        topLevelClass.addMethod(method);
    }

    private void addHashCodeMethod(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        Method method = new Method("hashCode");
        method.addAnnotation("@Override");
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(new FullyQualifiedJavaType("int"));

        StringJoiner bodyLine = new StringJoiner(", ", "return Objects.hash(", ");");
        for (IntrospectedColumn id : introspectedTable.getPrimaryKeyColumns()) {
            bodyLine.add(id.getJavaProperty());
        }
        method.addBodyLine(bodyLine.toString());

        topLevelClass.addMethod(method);
    }
}
