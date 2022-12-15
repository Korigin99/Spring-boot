package com.dw.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.member.model.Member;
import com.dw.member.repository.MemberRepo;


@RestController
public class MemberContorller {
	
	@Autowired
	MemberRepo repo;
	
	
	@GetMapping("/members")
	public List<Member> callAllMembers(){
		// findAll == select * from 테이블이름
		return repo.findAll();
	}
	
	@PostMapping("/member")
	public Member callSaveMember(@RequestBody Member member) {
		member = repo.save(member);
		return member;
	}
	
	@DeleteMapping("/member/{id}")
	public boolean callDeleteMember(@PathVariable long id) {
		try {
			repo.deleteById(id); // return 타입이 void
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@GetMapping("/member/{id}")
	public Member callMemberById(@PathVariable long id) {
		// findById == select * from emp where empno = 333;
		return repo.findById(id).get();
	}
	
	@PatchMapping("/member")
	public Member updateMember(@RequestBody Member member) {
		// save == update or insert
		// 동일한 PK 값이 있으면 update
		// 없으면 insert
		member = repo.save(member);
		return member;
	}
	
	
}
