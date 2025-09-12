package mpa.persistence.config;

public interface DataSourceConfigurer {

    DataSourceConfigurer sqlSessionFactoryName(String sqlSessionFactoryName);

    DataSourceConfigurer caseConversionStrategy(CaseConversionStrategy caseConversionStrategy);

}
