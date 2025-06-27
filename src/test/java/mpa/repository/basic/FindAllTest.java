package mpa.repository.basic;

import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@RepositoryTest
@DisplayName("findAll")
public class FindAllTest {

    @TEST_DB
    @Autowired
    MemberRepository memberRepository;


    @Test
    void byDefault_getAllUserCount_isGreaterThanZero() {
        // given
        int allUserCount = memberRepository.findAll().size();

        // then
        assertThat(allUserCount).isGreaterThan(0);
    }

    @Test
    void byDSL_getAllUserCount_isGreaterThanZero() {
        // given
        int allUserCount = memberRepository.findAll().size();

        // then
        assertThat(allUserCount).isGreaterThan(0);
    }
}
