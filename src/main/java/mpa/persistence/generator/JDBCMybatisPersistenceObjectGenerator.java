package mpa.persistence.generator;

import lombok.RequiredArgsConstructor;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.*;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class JDBCMybatisPersistenceObjectGenerator implements MybatisPersistenceObjectGenerator {

    private final Set<MybatisPersistenceGeneratorScope> scopes;


    @Override
    public void generate() {
        try {
            Directory directory = new Directory(GENERATE_ROOT_DIRECTORY);

            clearDirectory(directory);
            generateQualifiers();

            Configuration configuration = createGeneratorConfiguration(directory);
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

    private void clearDirectory(Directory directory) {
        if (!directory.exists()) {
            directory.mkdirs();
            return;
        }

        try (Stream<Path> walk = Files.walk(directory.toPath())) {
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

        directory.mkdirs();
    }

    private void generateQualifiers() {
        MybatisPersistenceQualifierGenerator qualifierGenerator = new MybatisPersistenceQualifierGenerator(scopes);
        qualifierGenerator.generate();
    }

    private Configuration createGeneratorConfiguration(Directory directory) {
        Configuration configuration = new Configuration();
        String path;

        for (MybatisPersistenceGeneratorScope scope : scopes) {
            path = getDriverAbsolutePath(scope);

            if (!configuration.getClassPathEntries().contains(path)) {
                configuration.addClasspathEntry(path);
            }
            Context context = toContext(directory, scope);
            configuration.addContext(context);
        }
        return configuration;
    }

    private String getDriverAbsolutePath(MybatisPersistenceGeneratorScope scope) {
        try {
            Class<?> driverClass = Class.forName(scope.getDataSource().getDriverClassName());
            return driverClass.getProtectionDomain().getCodeSource().getLocation().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Context toContext(Directory directory, MybatisPersistenceGeneratorScope scope) {
        Context context = new Context(ModelType.CONDITIONAL);
        context.setId(scope.getName());
        context.setTargetRuntime("MyBatis3DynamicSql");
        context.addPluginConfiguration(toStringPluginConfiguration());
        context.addPluginConfiguration(modelToEntityPluginConfiguration());
        context.addPluginConfiguration(mapperMethodsCustomizePluginConfiguration());
        context.addPluginConfiguration(repositoryGeneratePluginConfiguration());
        context.setCommentGeneratorConfiguration(commentGeneratorConfiguration());
        context.setJdbcConnectionConfiguration(jdbcConnectionConfiguration(scope));
        context.setJavaTypeResolverConfiguration(javaTypeResolverConfiguration());
        context.setJavaModelGeneratorConfiguration(javaModelGeneratorConfiguration(directory, scope));
        context.setJavaClientGeneratorConfiguration(javaClientGeneratorConfiguration(directory, scope));
        context.addTableConfiguration(tableConfiguration(scope, context));
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

    private JDBCConnectionConfiguration jdbcConnectionConfiguration(MybatisPersistenceGeneratorScope scope) {
        JDBCConnectionConfiguration config = new JDBCConnectionConfiguration();
        config.setDriverClass(scope.getDataSource().getDriverClassName());
        config.setConnectionURL(scope.getDataSource().getConnectionURL());
        config.setUserId(scope.getDataSource().getUsername());
        config.setPassword(scope.getDataSource().getPassword());
        return config;
    }

    private JavaTypeResolverConfiguration javaTypeResolverConfiguration() {
        JavaTypeResolverConfiguration config = new JavaTypeResolverConfiguration();
        config.addProperty("forceBigDecimals", "false");
        config.addProperty("useJSR310Types", "true");
        return config;
    }

    private JavaModelGeneratorConfiguration javaModelGeneratorConfiguration(Directory directory, MybatisPersistenceGeneratorScope scope) {
        JavaModelGeneratorConfiguration config = new JavaModelGeneratorConfiguration();
        config.setTargetProject(directory.getPath());
        config.setTargetPackage(scope.getTargetPackageName());
        return config;
    }

    private JavaClientGeneratorConfiguration javaClientGeneratorConfiguration(Directory directory, MybatisPersistenceGeneratorScope scope) {
        JavaClientGeneratorConfiguration config = new JavaClientGeneratorConfiguration();
        config.setTargetProject(directory.getPath());
        config.setTargetPackage(scope.getTargetPackageName() + ".repository");
        return config;
    }

    private TableConfiguration tableConfiguration(MybatisPersistenceGeneratorScope scope, Context context) {
        TableConfiguration config = new TableConfiguration(context);
        config.setSchema(scope.getDataSource().getSchema());
        config.setTableName("%");
        config.addProperty("useActualColumnNames", "false");
        return config;
    }

}
