package mpa.repository.basic;

import mpa.MybatisPersistenceManager;
import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.domain.MemberUtil;
import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.Member;
import mpa.fixture.domain.test_db.repository.MemberRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static mpa.fixture.domain.test_db.repository.MemberDynamicSqlSupport.id;
import static mpa.fixture.domain.test_db.repository.MemberDynamicSqlSupport.name;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@RepositoryTest
@DisplayName("update")
public class UpdateTest {

    @TEST_DB
    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MybatisPersistenceManager mybatisPersistenceManager;


    @BeforeAll
    void prepare() {
        mybatisPersistenceManager.stopAuditing();
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
