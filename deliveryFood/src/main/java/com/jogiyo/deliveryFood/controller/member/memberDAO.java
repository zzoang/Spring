package com.jogiyo.deliveryFood.controller.member;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jogiyo.deliveryFood.exception.deliveryFoodException;

@Repository // 컨트롤러가 현 Class파일을 스캔할수있도록 어노테이션하는것
public class memberDAO {

	
	// 로그인하는 메소드
	// 메소드의 타입은 리턴값의 타입으로 결정된다.
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	// 로그인
	public int login(memberVO vo) throws deliveryFoodException {
		return sqlSession.selectOne("memberSql.getlogin", vo);
	}

	// 회원가입
	public int join(memberVO vo) throws deliveryFoodException {
		return sqlSession.insert("memberSql.getjoin", vo);
	}
	
	// 회원정보 수정
	public int memberUpdate(memberVO vo) throws deliveryFoodException {
		return sqlSession.update("memberSql.memberUpdate", vo);		
	}
	
	// 회원탈퇴
	public int memberDelete(memberVO vo) throws deliveryFoodException {
		return sqlSession.delete("memberSql.memberDelete", vo);	
	}
}