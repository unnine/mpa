package mpa.repository.basic;

import default$.Member;
import default$.repository.MemberRepository;
import mpa.context.MybatisPersistenceAssistant;
import mpa.fixture.repository.RepositoryTest;
import org.junit.jupiter.api.BeforeAll;
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
@DisplayName("delete")
public class DeleteTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MybatisPersistenceAssistant mybatisPersistenceAssistant;


    @BeforeAll
    void prepare() {
        mybatisPersistenceAssistant.deactivateAuditing();
    }


    @Test
    @Transactional
    void byId_deleteUser_success() {
        // given
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);

        // when
        int deleteCount = memberRepository.delete(member.getId());

        // then
        Optional<Member> memberOp = memberRepository.findById(member.getId());

        assertThat(deleteCount).isEqualTo(1);
        assertThat(memberOp).isEmpty();
    }

    @Test
    @Transactional
    void byDSL_deleteUser_success() {
        // given
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);

        // when
        int deleteCount = memberRepository.delete(c -> c
                .where(id, isEqualTo(member.getId())));

        // then
        Optional<Member> memberOp = memberRepository.findById(member.getId());

        assertThat(deleteCount).isEqualTo(1);
        assertThat(memberOp).isEmpty();
    }
}
