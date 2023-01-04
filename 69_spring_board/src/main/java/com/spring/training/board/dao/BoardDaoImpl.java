package com.spring.training.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.training.board.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertBoard(BoardDto boardDto) throws Exception {
		sqlSession.insert("boardMapper.insertBoard" , boardDto);
	}

	@Override
	public List<BoardDto> selectListBoard() throws Exception {
		return sqlSession.selectList("boardMapper.selectListBoard");
	}

	@Override
	public BoardDto selectOneBoard(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void updateReadCount(int num) throws Exception {
		sqlSession.update("boardMapper.updateReadCount", num);
	}
	
	

}
