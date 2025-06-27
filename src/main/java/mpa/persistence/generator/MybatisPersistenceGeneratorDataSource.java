package mpa.persistence.generator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PACKAGE)
public class MybatisPersistenceGeneratorDataSource {
    private String driverClassName;
    private String connectionURL;
    private String username;
    private String password;
}
