package com.vnc.smarthomestay.service;

import com.vnc.smarthomestay.entity.Member;
import com.vnc.smarthomestay.exception.DataNotFoundException;
import com.vnc.smarthomestay.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member addMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        verify(member.getId());
        return memberRepository.save(member);
    }

    @Override
    public String loginMember(String email, String password) {
        List<Member> member = memberRepository.findMemberByEmailContaining(email);
        Member member1 = member.get(0);
        if(member == null){
            String message = "Member not found";
            throw new DataNotFoundException(message);
        }
        if(member1.getPassword() != password){
            String message = "Member not found";
            throw new DataNotFoundException(message);
        }
        return "Login Success";
    }

    public void verify(String id) {
        if (!memberRepository.findById(id).isPresent()) {
            String message = "Member not found";
            throw new DataNotFoundException(message);
        }
    }
}
