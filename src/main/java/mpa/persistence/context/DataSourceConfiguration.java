package mpa.persistence.context;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.config.DataSourceConfigurer;
import mpa.util.StringUtil;
import org.apache.ibatis.session.SqlSessionFactory;

@Getter
@RequiredArgsConstructor
public class DataSourceConfiguration implements DataSourceConfigurer {

    private final ApplicationContextAware contextAware;

    private final DataSourceAware dataSourceAware;


    @Override
    public DataSourceConfigurer sqlSessionFactoryName(String sqlSessionFactoryName) {
        if (StringUtil.isNotEmpty(sqlSessionFactoryName)) {
            SqlSessionFactory sessionFactory = contextAware.getBean(sqlSessionFactoryName, SqlSessionFactory.class);
            dataSourceAware.setSqlSessionFactory(sessionFactory);
        }
        return this;
    }

    @Override
    public DataSourceConfigurer caseConversionStrategy(CaseConversionStrategy caseConversionStrategy) {
        if (caseConversionStrategy != null) {
            dataSourceAware.setCaseConversionStrategy(caseConversionStrategy);
        }
        return this;
    }
}
