package mpa.repository.basic;

import default$.Member;
import default$.repository.MemberRepository;
import mpa.context.MybatisPersistenceAssistant;
import mpa.fixture.domain.MemberUtil;
import mpa.fixture.repository.RepositoryTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static default$.repository.MemberDynamicSqlSupport.id;
import static default$.repository.MemberDynamicSqlSupport.name;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@RepositoryTest
@DisplayName("update")
public class UpdateTest {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MybatisPersistenceAssistant mybatisPersistenceAssistant;


    @BeforeAll
    void prepare() {
        mybatisPersistenceAssistant.stopAuditing();
    }


    @Test
    @Transactional
    void byEntity_updateUser_onlyColumnsThatHaveChanged() {
        // given
        String updatedName = "updated member";
        Member member = MemberUtil.newMember("tester");

        memberRepository.insert(member);

        // when
        member.setName(updatedName);
        int updatedCount = memberRepository.update(member);

        // then
        Optional<Member> memberOp = memberRepository.findById(member.getId());

        assertThat(updatedCount).isEqualTo(1);
        assertThat(memberOp).isPresent();
        assertThat(memberOp.get()).isNotNull();
        assertThat(memberOp.get().getEmail()).isEqualTo(member.getEmail());
        assertThat(memberOp.get().getName()).isEqualTo(updatedName);
    }

    @Test
    @Transactional
    void byDSL_updateUser_onlyColumnsThatHaveChanged() {
        // given
        String updatedName = "updated member";
        Member member = MemberUtil.newMember("tester");

        memberRepository.insert(member);

        // when
        int updatedCount = memberRepository.update(c -> c
                .set(name).equalTo(updatedName)
                .where(id, isEqualTo(member.getId())));

        // then
        Optional<Member> memberOp = memberRepository.findById(member.getId());

        assertThat(updatedCount).isEqualTo(1);
        assertThat(memberOp).isPresent();
        assertThat(memberOp.get()).isNotNull();
        assertThat(memberOp.get().getEmail()).isEqualTo(member.getEmail());
        assertThat(memberOp.get().getName()).isEqualTo(updatedName);
    }
}
