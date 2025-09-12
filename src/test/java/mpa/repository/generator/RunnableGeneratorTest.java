package mpa.repository.generator;

import mpa.persistence.generator.RunnableMybatisPersistenceObjectGenerator;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class RunnableGeneratorTest {

    private static final String rootDirectoryPath = "src/main/mybatis-persistence";
    private static final String testDirectoryPath = rootDirectoryPath + "/default$";
    private static final String testQualifierPath = rootDirectoryPath + "/qualifier";


    @Test
    void runGenerator_baseXMLConfigurationFile_generatedEntityAndRepositoryClassFiles() {
        // when
        RunnableMybatisPersistenceObjectGenerator generator = new RunnableMybatisPersistenceObjectGenerator();
        generator.addDefaultScope()
                .dataSource(dataSourceConfigurer -> dataSourceConfigurer
                        .driverClassName("org.h2.Driver")
                        .connectionURL("jdbc:h2:~/testdb;AUTO_SERVER=TRUE")
                        .username("sa")
                        .password("")
                );
        generator.generate();

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
