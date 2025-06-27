package mpa.repository.generator;

import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.generator.MybatisPersistenceObjectGenerator;
import mpa.persistence.generator.XMLMybatisPersistenceObjectGeneratorRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class XMLGeneratorTest {

    private static final String rootDirectoryPath = MybatisPersistenceObjectGenerator.GENERATE_ROOT_DIRECTORY;
    private static final String testDirectoryPath = rootDirectoryPath + "/test_db";
    private static final String testQualifierPath = rootDirectoryPath + "/qualifier";


    @Test
    void runGenerator_baseXMLConfigurationFile_generatedEntityAndRepositoryClassFiles() {
        // given
        MybatisPersistenceObjectGenerator mybatisPersistenceObjectGeneratorRunner = new XMLMybatisPersistenceObjectGeneratorRunner();

        // when
        mybatisPersistenceObjectGeneratorRunner.generate();

        // then
        assertThatDirectory(new File(testQualifierPath));
        assertThatFile(new File(testQualifierPath + "/TEST_DB.java"));

        assertThatDirectory(new File(testDirectoryPath));
        assertThatFile(new File(testDirectoryPath + "/Member.java"));

        assertThatDirectory(new File(testDirectoryPath + "/repository"));
        assertThatFile(new File(testDirectoryPath + "/repository/MemberDynamicSqlSupport.java"));
        assertThatFile(new File(testDirectoryPath + "/repository/MemberMapper.java"));
        assertThatFile(new File(testDirectoryPath + "/repository/MemberRepository.java"));
    }

    private void assertThatFile(File file) {
        assertThat(file.exists()).isTrue();
        assertThat(file.isDirectory()).isFalse();
        assertThat(file.isFile()).isTrue();
    }

    private void assertThatDirectory(File file) {
        assertThat(file.exists()).isTrue();
        assertThat(file.isDirectory()).isTrue();
        assertThat(file.isFile()).isFalse();
    }


    @AfterAll
    static void destroy() {
        try (Stream<Path> walk = Files.walk(new File(testDirectoryPath).toPath())) {
            walk.sorted(Comparator.reverseOrder()).forEach(path -> {
                try {
                    Files.delete(path);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            File qualifierDir = new File(testQualifierPath);
            File qualifierFile = new File(testQualifierPath + "/TEST_DB.java");

            if (qualifierDir.exists() && qualifierFile.exists()) {
                qualifierFile.delete();
            }

            File[] childFiles = qualifierDir.listFiles();
            if (childFiles == null || childFiles.length == 0) {
                qualifierDir.delete();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
