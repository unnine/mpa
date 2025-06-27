package mpa.repository.generator;

import mpa.persistence.generator.Directory;
import mpa.persistence.generator.MybatisPersistenceObjectGenerator;
import mpa.persistence.generator.XMLMybatisPersistenceObjectGeneratorRunner;
import org.junit.jupiter.api.Test;

public class XMLGeneratorTest {


    @Test
    void runGenerator_baseXMLConfigurationFile_generatedEntityAndRepositoryClassFiles() {
        // given
        MybatisPersistenceObjectGenerator mybatisPersistenceObjectGeneratorRunner = new XMLMybatisPersistenceObjectGeneratorRunner();
        Directory directory = new Directory("src/test/java/mpa/fixture/domain");

        // when
        mybatisPersistenceObjectGeneratorRunner.generate(directory);

        // then

    }

}
