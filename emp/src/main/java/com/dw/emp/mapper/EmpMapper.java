package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.empvo.BoardVO;
import com.dw.empvo.EmpVO;

@Mapper
public interface EmpMapper {
	
	/**
	 * @Since : 2022. 12. 7.
	 * @Author : giwon
	 * @Return : List<EmpVO>
	 * @Comment : emp 테이블 호출
	 */
	List<EmpVO> selectEmp();
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : giwon
	 * @Return : List<EmpVO>
	 * @Comment : 사원 정보 상세조회
	 */
	EmpVO selectEmpfindByEmpno(int Empno);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : giwon
	 * @Return : int
	 * @Comment : emp테이블에 사원 추가
	 */
	int insertEmp(EmpVO vo);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : giwon
	 * @Return : int
	 * @Comment : EMP 테이블 사원 삭제
	 */
	int deleteEmp(int empno);
	
	/**
	 * @Since : 2022. 12. 8.
	 * @Author : giwon
	 * @Return : int
	 * @Comment : emp 테이블 사원 수정
	 */
	int updateEmp(EmpVO vo);
	
}
