package mpa.persistence.generator;

public class MybatisPersistenceObjectGeneratorRunner {

    public static void main(String[] args) {
        MybatisPersistenceObjectGenerator mapperGenerator = new JDBCMybatisPersistenceObjectGenerator();
        mapperGenerator.generate();
    }

}
