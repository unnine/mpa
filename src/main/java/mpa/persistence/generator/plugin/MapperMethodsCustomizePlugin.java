package mpa.persistence.generator.plugin;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;

import java.util.List;

public class MapperMethodsCustomizePlugin extends MapperCustomizePluginAdapter {


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }


    /**
     * select query
     */
    @Override
    public boolean clientBasicSelectManyMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.SELECT_MANY_BASIC);
        return true;
    }

    @Override
    public boolean clientGeneralSelectMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.SELECT_MANY);
        changeThisRefMethodName(method, "selectMany", MapperMethodName.SELECT_MANY_BASIC);
        return true;
    }

    @Override
    public boolean clientBasicSelectOneMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.SELECT_ONE_BASIC);
        return true;
    }

    @Override
    public boolean clientSelectOneMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.SELECT_ONE);
        changeThisRefMethodName(method, "selectOne", MapperMethodName.SELECT_ONE_BASIC);
        return true;
    }

    @Override
    public boolean clientSelectByPrimaryKeyMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.SELECT_BY_PRIMARY_KEY);
        rewriteBodyToChangeCallMethodName(method, "selectOne", MapperMethodName.SELECT_ONE);
        return true;
    }

    @Override
    public boolean clientGeneralSelectDistinctMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }


    /**
     * insert query
     */
    @Override
    public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {
        addProviderInsertMethodAndUnextendsCommonInsertMapper(interfaze);
        return true;
    }

    private void addProviderInsertMethodAndUnextendsCommonInsertMapper(Interface interfaze) {
        String commonInsertMapperName = "org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper";

        for (FullyQualifiedJavaType superInterfaceType : interfaze.getSuperInterfaceTypes()) {
            if (!superInterfaceType.getFullyQualifiedName().startsWith(commonInsertMapperName)) {
                continue;
            }
            if (superInterfaceType.getTypeArguments().isEmpty()) {
                break;
            }
            generateProviderInsertMethod(interfaze, superInterfaceType.getTypeArguments().get(0));
            interfaze.getSuperInterfaceTypes().remove(superInterfaceType);
            interfaze.getImportedTypes().remove(new FullyQualifiedJavaType(commonInsertMapperName));
            break;
        }
    }

    private void generateProviderInsertMethod(Interface interfaze, FullyQualifiedJavaType entityType) {
        Method insertMethod = new Method(MapperMethodName.INSERT_BY_PROVIDER);
        insertMethod.setVisibility(JavaVisibility.PUBLIC);
        insertMethod.setReturnType(new FullyQualifiedJavaType("int"));
        insertMethod.setAbstract(true);

        interfaze.addImportedType(new FullyQualifiedJavaType("org.mybatis.dynamic.sql.insert.render.InsertStatementProvider"));
        FullyQualifiedJavaType parameterType = new FullyQualifiedJavaType("org.mybatis.dynamic.sql.insert.render.InsertStatementProvider");
        parameterType.addTypeArgument(entityType);
        insertMethod.addParameter(new Parameter(parameterType, "insertStatement"));

        interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.InsertProvider"));
        interfaze.addImportedType(new FullyQualifiedJavaType("org.mybatis.dynamic.sql.util.SqlProviderAdapter"));
        insertMethod.addAnnotation("@InsertProvider(type = SqlProviderAdapter.class, method = \"insert\")");

        interfaze.addMethod(insertMethod);
    }

    @Override
    public boolean clientInsertMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.INSERT);
        return true;
    }

    @Override
    public boolean clientInsertMultipleMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientInsertSelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }


    /**
     * update query
     */
    @Override
    public boolean clientGeneralUpdateMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.UPDATE);
        return true;
    }

    @Override
    public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientUpdateAllColumnsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientUpdateSelectiveColumnsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.UPDATE_BY_PRIMARY_KEY);
        rewriteBodyToChangeCallMethodName(method, "update", MapperMethodName.UPDATE);
        return true;
    }

    @Override
    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }


    /**
     * delete query
     */
    @Override
    public boolean clientGeneralDeleteMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.DELETE);
        return true;
    }

    @Override
    public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        method.setName(MapperMethodName.DELETE_BY_PRIMARY_KEY);
        rewriteBodyToChangeCallMethodName(method, "delete", MapperMethodName.DELETE);
        return true;
    }


    private void changeThisRefMethodName(Method method, String sourceMethodName, String destMethodName) {
        replaceFirstBodyLine(method, "this::" + sourceMethodName, "this::" + destMethodName);
    }

    private void rewriteBodyToChangeCallMethodName(Method method, String sourceMethodName, String destMethodName) {
        replaceFirstBodyLine(method, sourceMethodName + "(", destMethodName + "(");
    }

    private void replaceFirstBodyLine(Method method, String source, String dest) {
        List<String> bodyLines = method.getBodyLines();
        String firstLine = bodyLines.get(0);
        String replacedLine = firstLine.replace(source, dest);

        bodyLines.remove(0);
        bodyLines.add(0, replacedLine);
    }
}
