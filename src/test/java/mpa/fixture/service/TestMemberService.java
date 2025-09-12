package mpa.fixture.service;

import default$.Member;
import default$.repository.MemberRepository;
import mpa.persistence.annotation.Mutations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestMemberService {

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
