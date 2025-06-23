package mpa.repository;

import mpa.SpringBootTestWithProfiles;
import mpa.client.SyUserMRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTestWithProfiles
@DisplayName("count")
public class CountTest {

    @Autowired
    SyUserMRepository userMRepository;


    @Test
    void byDefault_getAllUserCount_isGreaterThanZero() {
        // given
        long allUserCount = userMRepository.count();

        // then
        assertThat(allUserCount).isGreaterThanOrEqualTo(0);
    }

    @Test
    void byDSL_getAllUserCount_isGreaterThanZero() {
        // given
        long allUserCount = userMRepository.count(CountDSLCompleter.allRows());

        // then
        assertThat(allUserCount).isGreaterThanOrEqualTo(0);
    }

}
