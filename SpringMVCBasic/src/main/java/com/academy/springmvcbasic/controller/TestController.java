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
		return null;
	}
	
}
