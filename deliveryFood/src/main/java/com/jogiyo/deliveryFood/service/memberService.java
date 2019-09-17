package com.jogiyo.deliveryFood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogiyo.deliveryFood.controller.member.memberDAO;
import com.jogiyo.deliveryFood.controller.member.memberVO;

@Service
public class memberService {
	
	@Autowired
	private memberDAO memberDAO;
	
	
	// 로그인
	public boolean login(memberVO vo) {

		int result = memberDAO.login(vo);
		
		if( result == 2 ) {
			System.out.println("로그인 성공");
			return true;
		}
		else if ( result == 1 ) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if ( result == 0 ) {
			System.out.println("아이디가 없습니다.");	
		}
		return false;	
	}
	
	
	// 회원가입
	public boolean join(memberVO vo) {
		
		int result = memberDAO.join(vo);
		
		if( result == 1) {
			System.out.println("회원가입성공");
			return true;
		}
		else if(result == 0) {
			System.out.println("이미 존재하는 아이디입니다");
		}
		else if(result == -1) {
			System.out.println("회원가입실패");
		}
		return false;	
	}
	

	// 회원가입 수정
	public boolean memberUpdate(memberVO vo) {
		
		int result = memberDAO.memberUpdate(vo);
		
		if(result == -1){
			System.out.println("alert('수정되지 못하였습니다.')");
			return true;
		}
		else {
		}
		return false;	
	}
	
	
	// 회원탈퇴
	public boolean memberDelete(memberVO vo) {
		
		int result = memberDAO.memberDelete(vo);
		
		if(result == 1 ) {
			System.out.println("alert('정상적으로 회원탈퇴가 되었습니다.')");
			return true;
		}
		else {
			System.out.println("alert('비밀번호가 틀렸습니다.')");
		}
		return false;
	}
	
}
