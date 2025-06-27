package mpa.fixture.domain;

import mpa.fixture.domain.test_db.Member;
import org.springframework.jdbc.core.JdbcTemplate;

import java.time.LocalDate;

public class MemberUtil {

    public static Member newMember(String name) {
        Member member = new Member();
        member.setId(1);
        member.setName(name);
        member.setEmail("tester@mail.com");
        member.setCreatedt(LocalDate.now());
        member.setUpdatedt(LocalDate.now());
        return member;
    }

    public static void deleteMember(JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("DELETE FROM MEMBER WHERE id = 1");
    }

}
