package mpa.persistence.generator;

public interface MybatisPersistenceObjectGenerator {

    String GENERATE_ROOT_DIRECTORY = "src/mybatis-persistence";

    void generate();

}
