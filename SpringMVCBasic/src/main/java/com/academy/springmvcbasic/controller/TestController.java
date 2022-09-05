package com.academy.springmvcbasic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//������ 2.5xxxx �����뿡���� �Ʒ��� ���� Controller�� ��ӹ޾� �����Ͽ���.
public class TestController implements Controller {
	
	//3�ܰ� : �͓S�� ��ü �� ��Ű��
	//4�ܰ� : view �� ������ ����� �ִٸ� ��� ����
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("��û�� �޾ҽ��ϴ�.");
		
//		�Ʒ��� ModelAndView()�� �ٷ� ViewResolver�� �ؼ��ؾ� �� ��ü�̸�, �� ��ü�� ���� �ؼ��� ����� �������� 
//		������ DispatcherServlet���� JSP�� ����� ���޵ȴ�.
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","this is my first spring mvc result");//request ��ü�� �������.
//		/board/list.jsp --> /board/result/list �� �������� ���� url ��Ȱ��
		mav.setViewName("notice/result");
		return mav;
	}
	
}
