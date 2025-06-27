package mpa.repository.basic;

import mpa.MybatisPersistenceManager;
import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.Member;
import mpa.fixture.domain.test_db.repository.MemberRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static mpa.fixture.domain.test_db.repository.MemberDynamicSqlSupport.id;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@RepositoryTest
@DisplayName("delete")
public class DeleteTest {

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
