package mpa.repository.basic;

import default$.Member;
import default$.repository.MemberRepository;
import mpa.fixture.repository.RepositoryTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static default$.repository.MemberDynamicSqlSupport.id;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@RepositoryTest
@DisplayName("findOne")
public class FindOneTest {

    @Autowired
    MemberRepository memberRepository;


    @Test
    @Transactional
    void byDSL_getSpecificUser_success() {
        // given
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);

        // when
        Optional<Member> memberOp = memberRepository.findOne(c -> c
                .where(id, isEqualTo(member.getId())));

        // then
        assertThat(memberOp).isPresent();
        assertThat(memberOp.get()).isEqualTo(member);

    }
}
