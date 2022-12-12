package com.dw.empvo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardVO {
	
	private int board_no;
	private String title;
	private String contents;
	private String writer;
	private String create_at;
	private int board_count;
	
}
