package com.jogiyo.deliveryFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jogiyo.deliveryFood.controller.member.memberDAO;
import com.jogiyo.deliveryFood.service.memberService;

@Controller 
public class mainController {
	
	@Autowired // 의존하는 객체를 자동으로 삽입
	private memberDAO memberDAO; // memberLoginDAO인스턴스 객체를 어노테이션 하여 자동주입
	@Autowired
	private memberService memberService;

	@RequestMapping("/index")
	public String main() {
		return "/index";
	}
	
	// 에러페이지
	@RequestMapping("/error")
	public String error() {
		return "/error/error";
	}
	
}
