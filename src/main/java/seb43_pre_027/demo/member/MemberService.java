package seb43_pre_027.demo.member;

import org.springframework.stereotype.Service;
import seb43_pre_027.demo.member.entity.Member;

import java.util.List;
import java.util.Optional;
@Service
public class MemberService {

    MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member){
        memberRepository.save(member);
        return member;
    }

    public Member getMember(Long memberId){
        Optional<Member> byId = memberRepository.findById(memberId);
        Member findMember =
                byId.orElseThrow(() ->
                        null);
        return findMember;
    }
    public List<Member> getAllMember(){
        List<Member> all = memberRepository.findAll();

        return all;
    }
}
