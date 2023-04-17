package seb43_pre_027.demo.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import seb43_pre_027.demo.member.dto.MemberPostDto;
import seb43_pre_027.demo.member.entity.Member;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@RestController
@RequestMapping("/member")
@CrossOrigin()
public class MemberController {

    MemberService memberService;
    MemberMapper mapper;

    public MemberController(MemberService memberService, MemberMapper mapper) {
        this.memberService = memberService;
        this.mapper = mapper;
    }

    @GetMapping("/{member-id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity checkGet(@PathVariable("member-id") @Positive long memberId){
        Member member = memberService.getMember(memberId);

        return new ResponseEntity<>(mapper.memberToMemberResponseDto(member), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity checkGetAll(){
        List<Member> allMember = memberService.getAllMember();
        return new ResponseEntity<>(allMember, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity checkPost(@Valid @RequestBody MemberPostDto memberPostDto){
        Member member = mapper.memberPostToMember(memberPostDto);

        //생성하기
        Member member1 = memberService.createMember(member);
        return new ResponseEntity<>(member1, HttpStatus.CREATED);
    }
}
