package com.dw.member.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

// 테이블 이름은 소문자로
@Entity
@Table(name="dw_member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private int age;
	
	// @JoinColumn => member 테이블에 dept_id 라는 컬럼(Fk) 생성
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Dept dept; //
	
	
}
