package com.jogiyo.deliveryFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.jogiyo.deliveryFood.controller.member.*;
import com.jogiyo.deliveryFood.service.memberService;

@Controller // 현 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@SessionAttributes("id")
@RequestMapping("/member")
public class memberController {

	@Autowired // 의존하는 객체를 자동으로 삽입
	private memberDAO memberDAO; // memberLoginDAO인스턴스 객체를 어노테이션 하여 자동주입
	@Autowired
	private memberService memberService;

	
	// 로그인 화면
	@RequestMapping(value="/login", method=RequestMethod.GET) // 접속할 "/login"페이지를 별칭지정 해주는 것
	public String login() {
		return "/member/login"; // "/WEB-INF/views/member/login.jsp"로 포워드
	}
	
	// 로그인액션
   @RequestMapping(value = "/loginAction", method = RequestMethod.POST) // HTTP 메소드 제한 해제 ( RequestMethod.POST로 사용한다면 /deliveryfood/member/ 요청만 받을수있다.
   public String memberlogin(memberVO vo, Model model) {   //RequestParam을 통해 파라미터 값을 못 받을경우, 출력될 값을 설정한다.
      boolean rs = memberService.login(vo);
      if(rs == true) {
    	 model.addAttribute("id", vo.getId());
         return "redirect:/member/memberUpdate";
      } else 
         return "redirect:/member/login";
   }
   
   // 로그아웃
   @RequestMapping(value = "/logout")
   public String logout(SessionStatus session) {
	   session.setComplete();
	   return "redirect:/member/login";
   }
 
   
   
	// 회원가입 화면
	@RequestMapping(value="/join", method = RequestMethod.GET) // 접속할 "/join"페이지를 별칭지정 해주는 것
	public String join() {
		return "/member/join"; // "/WEB-INF/views/member/join.jsp"로 포워드
	}
	
	// 회원가입액션
	@RequestMapping(value="/joinAction", method = RequestMethod.POST) // 접속할 "/loginAction"페이지를 별칭지정 해주는 것
	public String memberjoin(memberVO vo) {
		boolean rs = memberService.join(vo);
		if(rs == true)
			return "redirect:/member/login"; // "/WEB-INF/views/member/loginAction.jsp"로 포워드
		else
			return "redirect:/member/join";
	}
	

	
	// 회원정보수정
	@RequestMapping(value="/memberUpdate", method = RequestMethod.GET)
	public String memberUpdate() {
		return "/member/memberUpdate";
	}
	// 회원정보수정 액션
	@RequestMapping(value="/memberUpdateAction", method = RequestMethod.POST)
	public String memberUpdateAction(@ModelAttribute memberVO vo) {
		memberService.memberUpdate(vo);
		return "redirect:/member/login";
	}

	
	

	
	// 회원탈퇴
		@RequestMapping(value="/memberDelete", method = RequestMethod.GET)
		public String memberDelete() {
			return "/member/memberDelete";
		}
		// 회원탈퇴 액션
		@RequestMapping(value="/memberDeleteAction", method = RequestMethod.POST)
		public String memberDeleteAction(memberVO vo) {
			memberService.memberDelete(vo);
			return "redirect:/member/join";
		}


}
