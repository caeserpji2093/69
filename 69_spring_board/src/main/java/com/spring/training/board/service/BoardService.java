package com.spring.training.board.service;

import java.util.List;

import com.spring.training.board.dto.BoardDto;

public interface BoardService {
	
	public void boardWrite(BoardDto boardDto) throws Exception;
	public List<BoardDto> getBoardList() throws Exception;
	public BoardDto getOneBoard(int num) throws Exception;
	public boolean modifyBoard (BoardDto boardDto) throws Exception;
}
