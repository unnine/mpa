package mpa.fixture.service;

import mpa.fixture.domain.qualifier.TEST_DB;
import mpa.fixture.domain.test_db.Member;
import mpa.fixture.domain.test_db.repository.MemberRepository;
import mpa.persistence.annotation.Mutations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestMemberService {

    @TEST_DB
    @Autowired
    private MemberRepository memberRepository;


    @Mutations("insert member test")
    public void insert(Member member) {
        memberRepository.insert(member);
    }

    @Mutations("update member test")
    public void update(Member member) {
        memberRepository.update(member);
    }

    @Mutations("delete member test")
    public void delete(Integer id) {
        memberRepository.delete(id);
    }

}
