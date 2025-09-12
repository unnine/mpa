package mpa.fixture.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestSchemaInitializer {

    private final JdbcTemplate jdbcTemplate;


    public void createMemberTable() {
        jdbcTemplate.execute("" +
                "  CREATE TABLE IF NOT EXISTS MEMBER (                 \n" +
                "    id int primary key,                               \n" +
                "    name varchar2(255) not null,                      \n" +
                "    email varchar2(255) not null,                     \n" +
                "    createDt date not null,                           \n" +
                "    updateDt date not null                            \n" +
                "  );                                                    "
        );

        jdbcTemplate.execute("" +
                "  CREATE TABLE IF NOT EXISTS MY_LIKE (                 \n" +
                "    id int primary key,                               \n" +
                "    member_id int not null,                           \n" +
                "    count int not null                                \n" +
                "  );                                                    "
        );
    }

    public void dropMemberTable() {
//        jdbcTemplate.execute("DROP TABLE MY_LIKE;");
//        jdbcTemplate.execute("DROP TABLE MEMBER;");
    }

}
