package com.project.movie.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

public interface OrderController {

	// ���� ���� ȭ�鿡 ���� ����Ʈ
	public ModelAndView MovieTitleList(HttpServletRequest request, HttpServletResponse response) throws Exception;

	// ����
	public ResponseEntity addOrder(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
