package com.vnc.smarthomestay.controller;

import com.vnc.smarthomestay.entity.Member;
import com.vnc.smarthomestay.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping
    public Member insertMember(@RequestBody Member member){
        return memberService.addMember(member);
    }

    @PutMapping
    public Member updateMember(@RequestBody Member member){
        return memberService.updateMember(member);
    }
}
