package mpa.fixture.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInitializer {

    private final JdbcTemplate jdbcTemplate;


    public void initMemberTable() {
        jdbcTemplate.execute("DELETE FROM MEMBER");

        jdbcTemplate.execute("" +
                "  INSERT INTO MEMBER (  \n" +
                "    id,                 \n" +
                "    name,               \n" +
                "    email,              \n" +
                "    createDt,           \n" +
                "    updateDt            \n" +
                ") VALUES (              \n" +
                "    9999,               \n" +
                "    'test',             \n" +
                "    'test@mail.com',    \n" +
                "    CURRENT_TIMESTAMP,  \n" +
                "    CURRENT_TIMESTAMP   \n" +
                ");                        "
        );
    }

}
