package com.vnc.smarthomestay.service;

import com.vnc.smarthomestay.entity.Member;

public interface MemberService {

    public Member addMember(Member member);

    public Member updateMember(Member member);

    public String loginMember(String email, String password);
}
