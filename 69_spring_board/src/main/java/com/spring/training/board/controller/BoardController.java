package com.spring.training.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.training.board.dto.BoardDto;
import com.spring.training.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/boardWrite", method = RequestMethod.GET)
	public ModelAndView boardWrite() throws Exception {
		return new ModelAndView("board/bWrite");
	}
	
	@RequestMapping(value = "/boardWrite", method= RequestMethod.POST)
	public ModelAndView boardWrite(BoardDto boardDto) throws Exception {
		boardService.boardWrite(boardDto);
		return new ModelAndView("redirect:boardList");
	}
	
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public ModelAndView boardList() throws Exception{
		throw new Exception ("hehehe");
	}

}
