package com.academy.springmvcbasic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//스프링 2.5xxxx 버전대에서는 아래와 같이 Controller를 상속받아 구현하였다.
public class TestController implements Controller {
	
	//3단계 : 앎밪는 객체 일 시키기
	//4단계 : view 로 가져갈 결과가 있다면 결과 저장
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("요청을 받았습니다.");
		return null;
	}
	
}
