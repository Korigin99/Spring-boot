package com.dw.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.EmpMapper;
import com.dw.empvo.BoardVO;
import com.dw.empvo.EmpVO;

@Service
public class EmpService {
	
	@Autowired
	EmpMapper empMapper;
	
	public List<EmpVO> selectEmp(){
		return empMapper.selectEmp();
	}
	
	public EmpVO selectEmpfindByEmpno(int empno) {
		return empMapper.selectEmpfindByEmpno(empno);
	}
	
	// 사원 추가
	public int callEmpJoin(EmpVO emp) {
		return empMapper.insertEmp(emp);
	}
	
	// 사원 삭제
	public int callEmpDelete(int empno) {
		return empMapper.deleteEmp(empno);
	}
	
	// 사원 수정
	public int callEmpUpdate(EmpVO emp) {
		return empMapper.updateEmp(emp);
	}
	
	
}
