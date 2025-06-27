package mpa.persistence.generator;

import lombok.RequiredArgsConstructor;
import mpa.util.StringUtil;

import java.io.File;
import java.io.FileWriter;
import java.util.Collection;

@RequiredArgsConstructor
public class MybatisPersistenceQualifierGenerator implements MybatisPersistenceObjectGenerator {

    public static final String QUALIFIER_DIRECTORY_NAME = "qualifier";

    private final Collection<MybatisPersistenceGeneratorScope> scopes;


    @Override
    public void generate(Directory directory) {
        if (scopes == null) {
            return;
        }
        for (MybatisPersistenceGeneratorScope scope : scopes) {
            File qualifierDirectory = getQualifierDirectory(directory);
            generate(qualifierDirectory, scope);
        }
    }

    private void generate(File qualifierDirectory, MybatisPersistenceGeneratorScope scope) {
        if (scope == null || StringUtil.isEmpty(scope.getName())) {
            return;
        }

        String className = scope.getName().toUpperCase();
        StringBuilder content = new StringBuilder();

        try (FileWriter writer = new FileWriter(qualifierDirectory.getPath() + "/" + className + ".java")) {
            writer.write(content
                    .append("package ").append(qualifierDirectory.getPath()).append(";\n")
                    .append("\n")
                    .append("import org.springframework.beans.factory.annotation.Qualifier;\n")
                    .append("\n")
                    .append("import java.lang.annotation.ElementType;\n")
                    .append("import java.lang.annotation.Retention;\n")
                    .append("import java.lang.annotation.RetentionPolicy;\n")
                    .append("import java.lang.annotation.Target;\n")
                    .append("\n")
                    .append("@Retention(RetentionPolicy.RUNTIME)\n")
                    .append("@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})\n")
                    .append("@Qualifier\n")
                    .append("public @interface ").append(className).append(" {}")
                    .toString());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private File getQualifierDirectory(Directory directory) {
        File dir = new File(directory.getPath() + "/" + QUALIFIER_DIRECTORY_NAME);

        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

}
