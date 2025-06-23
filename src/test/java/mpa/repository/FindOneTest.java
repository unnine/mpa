package mpa.repository;

import mpa.SpringBootTestWithProfiles;
import mpa.SyUser;
import mpa.client.SyUserMRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

import static mpa.client.SyUserDynamicSqlSupport.syUser;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@SpringBootTestWithProfiles
@DisplayName("findOne")
public class FindOneTest {

    @Autowired
    SyUserMRepository userMRepository;


    @Test
    @Transactional
    void byDSL_getSpecificUser_success() {
        // given
        SyUser user = newUser();
        userMRepository.insert(user);

        // when
        Optional<SyUser> userOp = userMRepository.findOne(c -> c
                .where(syUser.userUid, isEqualTo(user.getUserUid())));

        // then
        assertThat(userOp).isPresent();
        assertThat(userOp.get()).isEqualTo(user);

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
