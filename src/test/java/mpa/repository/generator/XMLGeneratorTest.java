package mpa.repository.generator;

import mpa.persistence.generator.XMLMybatisPersistenceObjectGeneratorRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class XMLGeneratorTest {

    private static final String rootDirectoryPath = "src/main/mybatis-persistence";
    private static final String testDirectoryPath = rootDirectoryPath + "/default$";
    private static final String testQualifierPath = rootDirectoryPath + "/qualifier";


    @Test
    void runGenerator_baseXMLConfigurationFile_generatedEntityAndRepositoryClassFiles() {
        // when
        XMLMybatisPersistenceObjectGeneratorRunner.main(null);

        // then
        assertThatDirectory(new File(testQualifierPath));
        assertThatFile(new File(testQualifierPath + "/DEFAULT$.java"));

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

}
