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
@DisplayName("update")
public class UpdateTest {

    @Autowired
    SyUserMRepository userMRepository;


    @Test
    @Transactional
    void byEntity_updateUser_onlyColumnsThatHaveChanged() {
        // given
        String updatedName = "Updated User";
        SyUser user = newUser();

        userMRepository.insert(user);

        // when
        user.setLoclNm(updatedName);
        int updatedCount = userMRepository.update(user);

        // then
        Optional<SyUser> userOp = userMRepository.findById(user.getUserUid());

        assertThat(updatedCount).isEqualTo(1);
        assertThat(userOp).isPresent();
        assertThat(userOp.get()).isNotNull();
        assertThat(userOp.get().getEmail()).isEqualTo(user.getEmail());
        assertThat(userOp.get().getLoclNm()).isEqualTo(updatedName);
    }

    @Test
    @Transactional
    void byDSL_updateUser_onlyColumnsThatHaveChanged() {
        // given
        String updatedName = "Updated User";
        SyUser user = newUser();

        userMRepository.insert(user);

        // when
        int updatedCount = userMRepository.update(c -> c
                .set(syUser.loclNm).equalTo(updatedName)
                .where(syUser.userUid, isEqualTo(user.getUserUid())));

        // then
        Optional<SyUser> userOp = userMRepository.findById(user.getUserUid());

        assertThat(updatedCount).isEqualTo(1);
        assertThat(userOp).isPresent();
        assertThat(userOp.get()).isNotNull();
        assertThat(userOp.get().getEmail()).isEqualTo(user.getEmail());
        assertThat(userOp.get().getLoclNm()).isEqualTo(updatedName);
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
