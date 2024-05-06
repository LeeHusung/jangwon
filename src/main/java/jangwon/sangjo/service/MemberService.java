package jangwon.sangjo.service;

import jakarta.transaction.Transactional;
import jangwon.sangjo.domain.Member;
import jangwon.sangjo.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public void joinMember(Member member) {
        memberRepository.save(member);
    }

}
