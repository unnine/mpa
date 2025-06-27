package mpa.repository.basic;

import mpa.context.MybatisPersistenceManager;
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

import static org.assertj.core.api.Assertions.assertThat;

@RepositoryTest
@DisplayName("insert")
public class InsertTest {

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
    void byEntity_createOneUser_increaseUserCountBy1() {
        // given
        int beforeAllUserCount = memberRepository.findAll().size();
        Member member = MemberUtil.newMember("tester");

        // when
        int createdCount = memberRepository.insert(member);

        // then
        int afterAllUserCount = memberRepository.findAll().size();

        assertThat(createdCount).isEqualTo(1);
        assertThat(afterAllUserCount - beforeAllUserCount).isEqualTo(1);
    }
}
