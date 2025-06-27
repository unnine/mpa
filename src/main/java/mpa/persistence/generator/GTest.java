package mpa.persistence.generator;

public class GTest {

    public static void main(String[] args) {
        RunnableMybatisPersistenceObjectGenerator generator = new RunnableMybatisPersistenceObjectGenerator();

        generator.addScope(scopeConfigure -> scopeConfigure
                .name("qms")
                .namespace("database")
                .dataSource(dataSourceConfigure -> dataSourceConfigure
                    .driverClassName("oracle.jdbc.OracleDriver")
                    .connectionURL("jdbc:oracle:thin:@203.229.218.220:1521:orcl")
                    .username("PHM7_1_QMS_USER")
                    .password("PHM71QMSUSER")
                ))
                .generate();
    }

}
