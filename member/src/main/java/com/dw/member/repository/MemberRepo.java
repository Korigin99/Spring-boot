package com.dw.member.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

// JPA를 상속 받는다.
public interface MemberRepo extends JpaRepository<Member, Long>{
	
}
