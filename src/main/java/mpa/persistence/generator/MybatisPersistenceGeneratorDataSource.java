package mpa.persistence.generator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import mpa.util.StringUtil;

@Getter
@Setter(AccessLevel.PACKAGE)
public class MybatisPersistenceGeneratorDataSource {
    private String driverClassName;
    private String connectionURL;
    private String username;
    private String password;
    private String schema;


    public String getSchema() {
        if (StringUtil.isNotEmpty(schema)) {
            return schema;
        }
        return username;
    }
}
