package mpa.persistence.generator;

import lombok.RequiredArgsConstructor;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class JDBCMybatisPersistenceObjectGenerator implements MybatisPersistenceObjectGenerator {

    private final Set<MybatisPersistenceGeneratorScope> contexts;


    @Override
    public void generate() {
        try {
            clearDirectory();

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

    private void clearDirectory() {
        File dir = new File("src/mybatis-persistence");

        if (!dir.exists()) {
            dir.mkdirs();
            return;
        }

        try (Stream<Path> walk = Files.walk(dir.toPath())) {
            walk.sorted(Comparator.reverseOrder()).forEach(path -> {
                try {
                    Files.delete(path);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        dir.mkdirs();
    }

    private Configuration createGeneratorConfiguration() {
        Configuration configuration = new Configuration();
        String path;

        for (MybatisPersistenceGeneratorScope generateContext : contexts) {
            path = getDriverAbsolutePath(generateContext);

            if (!configuration.getClassPathEntries().contains(path)) {
                configuration.addClasspathEntry(path);
            }
            configuration.addContext(toMybatisContext(generateContext));
        }
        return configuration;
    }

    private String getDriverAbsolutePath(MybatisPersistenceGeneratorScope generateContext) {
        try {
            Class<?> driverClass = Class.forName(generateContext.getDataSource().getDriverClassName());
            return driverClass.getProtectionDomain().getCodeSource().getLocation().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Context toMybatisContext(MybatisPersistenceGeneratorScope generateContext) {
        Context context = new Context(ModelType.CONDITIONAL);
        context.setId(generateContext.getName());
        context.setTargetRuntime("MyBatis3DynamicSql");
        context.addPluginConfiguration(toStringPluginConfiguration());
        context.addPluginConfiguration(modelToEntityPluginConfiguration());
        context.addPluginConfiguration(mapperMethodsCustomizePluginConfiguration());
        context.addPluginConfiguration(repositoryGeneratePluginConfiguration());
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration());
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration(generateContext));
        context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration());
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration(generateContext));
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration(generateContext));
        context.addTableConfiguration(tableConfiguration(generateContext, context));
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

    private JDBCConnectionConfiguration jdbcConnectionConfiguration(MybatisPersistenceGeneratorScope generateContext) {
        JDBCConnectionConfiguration config = new JDBCConnectionConfiguration();
        config.setDriverClass(generateContext.getDataSource().getDriverClassName());
        config.setConnectionURL(generateContext.getDataSource().getConnectionURL());
        config.setUserId(generateContext.getDataSource().getUsername());
        config.setPassword(generateContext.getDataSource().getPassword());
        return config;
    }

    private JavaTypeResolverConfiguration javaTypeResolverConfiguration() {
        JavaTypeResolverConfiguration config = new JavaTypeResolverConfiguration();
        config.addProperty("forceBigDecimals", "false");
        config.addProperty("useJSR310Types", "true");
        return config;
    }

    private JavaModelGeneratorConfiguration javaModelGeneratorConfiguration(MybatisPersistenceGeneratorScope generateContext) {
        JavaModelGeneratorConfiguration config = new JavaModelGeneratorConfiguration();
        config.setTargetProject("src/mybatis-persistence");
        config.setTargetPackage(generateContext.getTargetPackageName());
        return config;
    }

    private JavaClientGeneratorConfiguration javaClientGeneratorConfiguration(MybatisPersistenceGeneratorScope generateContext) {
        JavaClientGeneratorConfiguration config = new JavaClientGeneratorConfiguration();
        config.setTargetProject("src/mybatis-persistence");
        config.setTargetPackage(generateContext.getTargetPackageName() + ".repository");
        return config;
    }

    private TableConfiguration tableConfiguration(MybatisPersistenceGeneratorScope generateContext, Context context) {
        TableConfiguration config = new TableConfiguration(context);
        config.setSchema(generateContext.getDataSource().getUsername());
        config.setTableName("%");
        config.addProperty("useActualColumnNames", "false");
        return config;
    }

}
