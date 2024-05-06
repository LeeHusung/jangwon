package jangwon.sangjo.controller;

import jangwon.sangjo.domain.Member;
import jangwon.sangjo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("member/join")
    public String joinMember() {
        Member member = new Member();
        member.setName("husung");
        member.setEmail("mn040820@naver.com");
        memberService.joinMember(member);
        return "ok";
    }
}
