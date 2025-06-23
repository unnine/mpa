package mpa.repository;

import mpa.SpringBootTestWithProfiles;
import mpa.client.SyUserMRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTestWithProfiles
@DisplayName("findAll")
public class FindAllTest {

    @Autowired
    SyUserMRepository userMRepository;


    @Test
    void byDefault_getAllUserCount_isGreaterThanZero() {
        // given
        int allUserCount = userMRepository.findAll().size();

        // then
        assertThat(allUserCount).isGreaterThanOrEqualTo(0);
    }

    @Test
    void byDSL_getAllUserCount_isGreaterThanZero() {
        // given
        int allUserCount = userMRepository.findAll(SelectDSLCompleter.allRows()).size();

        // then
        assertThat(allUserCount).isGreaterThanOrEqualTo(0);
    }

}
