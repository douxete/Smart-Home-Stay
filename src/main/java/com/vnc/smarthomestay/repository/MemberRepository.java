package com.vnc.smarthomestay.repository;

import com.vnc.smarthomestay.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String> {
    List<Member> findMemberByEmailContaining(String email);
}
