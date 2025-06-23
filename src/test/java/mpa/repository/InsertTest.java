package mpa.repository;

import mpa.SpringBootTestWithProfiles;
import mpa.SyUser;
import mpa.client.SyUserMRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTestWithProfiles
@DisplayName("insert")
public class InsertTest {

    @Autowired
    SyUserMRepository userMRepository;


    @Test
    @Transactional
    void byEntity_createOneUser_increaseUserCountBy1() {
        // given
        int beforeAllUserCount = userMRepository.findAll(SelectDSLCompleter.allRows()).size();
        SyUser user = newUser();

        // when
        int createdCount = userMRepository.insert(user);

        // then
        int afterAllUserCount = userMRepository.findAll(SelectDSLCompleter.allRows()).size();

        assertThat(createdCount).isEqualTo(1);
        assertThat(afterAllUserCount - beforeAllUserCount).isEqualTo(1);
    }


    private SyUser newUser() {
        SyUser user = new SyUser();
        user.setId("!@#$%^&*");
        user.setLoclNm("Test User");
        user.setEmail("test-user@email.com");
        user.setCrtDs(LocalDateTime.now());
        user.setUdtDs(LocalDateTime.now());
        return user;
    }
}
