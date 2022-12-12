package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.empvo.BoardVO;

@Mapper
public interface BoardMapper {
	
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : giwon
	 * @Return : List<BoardVO>
	 * @Comment : borad 테이블 조회
	 */
	List<BoardVO> selectBoard();
	
}
