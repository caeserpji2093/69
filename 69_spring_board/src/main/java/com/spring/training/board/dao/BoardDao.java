package com.spring.training.board.dao;

import java.util.List;

import com.spring.training.board.dto.BoardDto;

public interface BoardDao {
	
	public void insertBoard(BoardDto boardDto) throws Exception;
	public List<BoardDto> selectListBoard() throws Exception;
	public BoardDto selectOneBoard(int num) throws Exception;

}
