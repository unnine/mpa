package mpa.persistence.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;

public class JDBCMybatisPersistenceObjectGenerator implements MybatisPersistenceObjectGenerator {

    @Override
    public void generate() {
        try {
            Configuration configuration = createGeneratorConfiguration();
            DefaultShellCallback shellCallback = new DefaultShellCallback(true);
            Warnings warnings = new Warnings();
            MyBatisGenerator generator = new MyBatisGenerator(configuration, shellCallback, warnings);
            generator.generate(null);

            if (!warnings.isEmpty()) {
                warnings.print();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Configuration createGeneratorConfiguration() {
        Configuration configuration = new Configuration();
        configuration.addClasspathEntry(getDriverAbsolutePath());
        configuration.addContext(createContext());
        return configuration;
    }

    private String getDriverAbsolutePath() {
        try {
            Class<?> driverClass = Class.forName("oracle.jdbc.OracleDriver"); // TODO driverClass 가져오기
            return driverClass.getProtectionDomain().getCodeSource().getLocation().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Context createContext() {
        Context context = new Context(ModelType.CONDITIONAL);
        context.setId("mybatisPersistenceAssistant");
        context.setTargetRuntime("MyBatis3DynamicSql");
        context.addPluginConfiguration(toStringPluginConfiguration());
        context.addPluginConfiguration(modelToEntityPluginConfiguration());
        context.addPluginConfiguration(mapperMethodsCustomizePluginConfiguration());
        context.addPluginConfiguration(repositoryGeneratePluginConfiguration());
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration());
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration());
        context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration());
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration());
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration());
        context.addTableConfiguration(tableConfiguration(context));
        return context;
    }

    private PluginConfiguration toStringPluginConfiguration() {
        PluginConfiguration config = new PluginConfiguration();
        config.setConfigurationType("org.mybatis.generator.plugins.ToStringPlugin");
        return config;
    }

    private PluginConfiguration modelToEntityPluginConfiguration() {
        PluginConfiguration config = new PluginConfiguration();
        config.setConfigurationType("mpa.persistence.generator.plugin.ModelToEntityPlugin");
        return config;
    }

    private PluginConfiguration mapperMethodsCustomizePluginConfiguration() {
        PluginConfiguration config = new PluginConfiguration();
        config.setConfigurationType("mpa.persistence.generator.plugin.MapperMethodsCustomizePlugin");
        return config;
    }

    private PluginConfiguration repositoryGeneratePluginConfiguration() {
        PluginConfiguration config = new PluginConfiguration();
        config.setConfigurationType("mpa.persistence.generator.plugin.RepositoryGeneratePlugin");
        return config;
    }

    private CommentGeneratorConfiguration commentGeneratorConfiguration() {
        CommentGeneratorConfiguration config = new CommentGeneratorConfiguration();
        config.addProperty("suppressAllComments", "true");
        config.addProperty("useLegacyGeneratedAnnotation", "true");
        return config;
    }

    /**
     * TODO Java Config / Boot 2가지 방식 고려
     */
    private JDBCConnectionConfiguration jdbcConnectionConfiguration() {
        JDBCConnectionConfiguration config = new JDBCConnectionConfiguration();
        config.setDriverClass("oracle.jdbc.OracleDriver"); // TODO 현재 데이터소스 드라이버
        config.setConnectionURL("jdbc:oracle:thin:@203.229.218.220:1521:orcl"); // TODO 현재 데이터소스 URL
        config.setUserId("PHM7_1_QMS_USER"); // TODO 현재 데이터소스 사용자명
        config.setPassword("PHM71QMSUSER"); // TODO 현재 데이터소스 비밀번호
        return config;
    }

    private JavaTypeResolverConfiguration javaTypeResolverConfiguration() {
        JavaTypeResolverConfiguration config = new JavaTypeResolverConfiguration();
        config.addProperty("forceBigDecimals", "false");
        config.addProperty("useJSR310Types", "true");
        return config;
    }

    private JavaModelGeneratorConfiguration javaModelGeneratorConfiguration() {
        JavaModelGeneratorConfiguration config = new JavaModelGeneratorConfiguration();
        config.setTargetProject("src/mybatis-generator");
        config.setTargetPackage("mpa");
        return config;
    }

    private JavaClientGeneratorConfiguration javaClientGeneratorConfiguration() {
        JavaClientGeneratorConfiguration config = new JavaClientGeneratorConfiguration();
        config.setTargetProject("src/mybatis-generator");
        config.setTargetPackage("mpa.client");
        return config;
    }

    private TableConfiguration tableConfiguration(Context context) {
        TableConfiguration config = new TableConfiguration(context);
        config.setSchema("PHM7_1_QMS_USER"); // TODO 현재 데이터소스 드라이버
        config.setTableName("%");
        config.addProperty("useActualColumnNames", "false");
        return config;
    }

}
