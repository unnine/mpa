package mpa.repository.basic;

import mpa.fixture.repository.RepositoryTest;
import mpa.fixture.domain.test_db.Member;
import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RepositoryTest
@DisplayName("findById")
public class FindByIdTest {

    @TEST_DB
    @Autowired
    MemberRepository memberRepository;


    @Test
    @Transactional
    void byDefault_getSpecificUser_success() {
        // given
        List<Member> members = memberRepository.findAll();
        Member member = members.get(0);

        // when
        Optional<Member> memberOp = memberRepository.findById(member.getId());

        // then
        assertThat(memberOp).isPresent();
        assertThat(memberOp.get()).isEqualTo(member);
    }
}
