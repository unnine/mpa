package mpa.repository.basic;

import default$.repository.MemberRepository;
import mpa.fixture.repository.RepositoryTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@RepositoryTest
@DisplayName("count")
public class CountTest {

    @Autowired
    MemberRepository memberRepository;


    @Test
    void byDefault_getAllUserCount_isGreaterThanZero() {
        // given
        long allUserCount = memberRepository.count();

        // then
        assertThat(allUserCount).isGreaterThanOrEqualTo(0);
    }

    @Test
    void byDSL_getAllUserCount_isGreaterThanZero() {
        // given
        long allUserCount = memberRepository.count();

        // then
        assertThat(allUserCount).isGreaterThanOrEqualTo(0);
    }

}
