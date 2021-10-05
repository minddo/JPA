package com.minddo.datajpa.controller;

<<<<<<< HEAD
import com.minddo.datajpa.dto.MemberDto;
import com.minddo.datajpa.entity.Member;
import com.minddo.datajpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
=======
import com.minddo.datajpa.entity.Member;
import com.minddo.datajpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
>>>>>>> 6182b275a42011a490e5e00da1eb00a17e31bdc8
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/members/{id}")
    public String findMember(@PathVariable("id")Long id) {
        Member member = memberRepository.findById(id).get();
        return member.getUsername();
    }

<<<<<<< HEAD
    @GetMapping("/members")
    public Page<MemberDto> list(@PageableDefault(size = 10) Pageable pageable) {
        Page<Member> page = memberRepository.findAll(pageable);
        Page<MemberDto> map = page.map(member -> new MemberDto(member));
        return map;
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 100; i++) {
            memberRepository.save(new Member("user"+i, i));
        }
=======
    @GetMapping("/members2/{id}")
    public String findMember2(@PathVariable("id")Member member) {
        return member.getUsername();
    }



    @PostConstruct
    public void init() {
        memberRepository.save(new Member("userA"));
>>>>>>> 6182b275a42011a490e5e00da1eb00a17e31bdc8
    }
}
