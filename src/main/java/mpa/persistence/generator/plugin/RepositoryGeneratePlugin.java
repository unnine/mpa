package mpa.persistence.generator.plugin;

import mpa.persistence.generator.MybatisPersistenceQualifierGenerator;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RepositoryGeneratePlugin extends MapperCustomizePluginAdapter {

    private final Map<String, Interface> interfaces = new ConcurrentHashMap<>();


    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, IntrospectedTable introspectedTable) {
        interfaze.getAnnotations().removeIf(annotation -> annotation.contains("@Mapper"));
        interfaze.getImportedTypes().remove(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper"));
        interfaces.put(getName(introspectedTable), interfaze);
        return true;
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
        String tableName = getName(introspectedTable);
        Interface mapperInterface = interfaces.get(tableName);
        String repositoryName = getRepositoryName(mapperInterface);

        RepositoryInterface repositoryInterface = new RepositoryInterface(repositoryName, mapperInterface);
        repositoryInterface.addFindAllWithoutParametersMethod();
        repositoryInterface.addCountWithoutParametersMethod();

        GeneratedJavaFile repositoryJavaFile = new GeneratedJavaFile(
                repositoryInterface,
                context.getJavaClientGeneratorConfiguration().getTargetProject(),
                context.getProperty("javaFileEncoding"),
                context.getJavaFormatter()
        );

        interfaces.remove(tableName);

        return new ArrayList<>(Arrays.asList(repositoryJavaFile));
    }

    private String getName(IntrospectedTable introspectedTable) {
        String schemaName = introspectedTable.getFullyQualifiedTable().getIntrospectedSchema();
        String tableName = introspectedTable.getFullyQualifiedTable().getIntrospectedTableName();
        return schemaName + "." + tableName;
    }

    private String getRepositoryName(Interface superInterface) {
        FullyQualifiedJavaType mapperType = superInterface.getType();
        String mapperName = mapperType.getShortName();
        String packageName = mapperType.getPackageName();
        String repositoryName = mapperName.substring(0, mapperName.length() - 6) + "Repository";
        return packageName + "." + repositoryName;
    }


    private static class RepositoryInterface extends Interface {

        private final Interface superInterface;


        public RepositoryInterface(String name, Interface superInterface) {
            super(name);

            toAssistantRepository(superInterface);

            this.superInterface = superInterface;

            inherits();
            addToQualifier();
            toMapper();
        }

        private void toAssistantRepository(Interface interfaze) {
            FullyQualifiedJavaType assistantInterface = new FullyQualifiedJavaType("MybatisPersistenceAssistantRepository");
            String entityName = getEntityName(interfaze);
            assistantInterface.addTypeArgument(new FullyQualifiedJavaType(entityName));

            interfaze.addImportedType(new FullyQualifiedJavaType("mpa.persistence.MybatisPersistenceAssistantRepository"));
            interfaze.addSuperInterface(assistantInterface);
        }

        private void inherits() {
            this.addSuperInterface(superInterface.getType());
            this.setVisibility(JavaVisibility.PUBLIC);
        }

        private void addToQualifier() {
            FullyQualifiedJavaType mapperType = superInterface.getType();
            String packageName = mapperType.getPackageName();
            String scopeName = packageName.split("\\.")[0];
            String qualifier = scopeName.toUpperCase();

            this.addImportedType(new FullyQualifiedJavaType(MybatisPersistenceQualifierGenerator.QUALIFIER_DIRECTORY_NAME + "." + qualifier));
            this.addAnnotation("@" + qualifier);
        }

        private void toMapper() {
            this.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper"));
            this.addAnnotation("@Mapper");
        }

        private String getEntityName(Interface interfaze) {
            FullyQualifiedJavaType type = interfaze.getType();
            String name = type.getShortName();
            return name.substring(0, name.length() - 6);
        }

        void addFindAllWithoutParametersMethod() {
            Method method = new Method("findAll");
            method.setDefault(true);
            method.setVisibility(JavaVisibility.PUBLIC);
            method.addBodyLine("return this." + MapperMethodName.SELECT_MANY + "(SelectDSLCompleter.allRows());");
            setReturnTypeOfSuperMethod(method, MapperMethodName.SELECT_MANY);

            this.addImportedType(new FullyQualifiedJavaType("org.mybatis.dynamic.sql.select.SelectDSLCompleter"));
            this.addMethod(method);
        }

        void addCountWithoutParametersMethod() {
            Method method = new Method("count");
            method.setDefault(true);
            method.setVisibility(JavaVisibility.PUBLIC);
            method.addBodyLine("return this." + MapperMethodName.COUNT + "(CountDSLCompleter.allRows());");
            setReturnTypeOfSuperMethod(method, MapperMethodName.COUNT);

            this.addImportedType(new FullyQualifiedJavaType("org.mybatis.dynamic.sql.select.CountDSLCompleter"));
            this.addMethod(method);
        }

        private void setReturnTypeOfSuperMethod(Method method, String superMethodName) {
            superInterface.getMethods().stream()
                    .filter(superMethod -> superMethod.getName().equals(superMethodName))
                    .findAny()
                    .flatMap(Method::getReturnType)
                    .ifPresent(returnType -> {
                        this.addImportedType(returnType);
                        method.setReturnType(returnType);
                    });
        }
    }
}