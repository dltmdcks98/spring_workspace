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
		
//		아래의 ModelAndView()가 바로 ViewResolver가 해석해야 할 객체이며, 이 객체를 통해 해석된 결과를 바탕으로 
//		형님인 DispatcherServlet에게 JSP와 결과가 전달된다.
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","this is my first spring mvc result");//request 객체에 담아진다.
//		/board/list.jsp --> /board/result/list 로 하지말고 기존 url 재활용
		mav.setViewName("notice/result");
		return mav;
	}
	
}
