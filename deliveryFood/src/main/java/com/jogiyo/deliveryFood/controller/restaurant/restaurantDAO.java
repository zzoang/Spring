package com.jogiyo.deliveryFood.controller.restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jogiyo.deliveryFood.exception.deliveryFoodException;

@Repository
public class restaurantDAO {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	// 레스토랑 리스트
	
	// 레스토랑 정보보기
	
	// 레스토랑 등록
	public int entollment(restaurantVO vo) throws deliveryFoodException {
		return sqlSession.insert("restaurnatSql.getentollment", vo);
	}

	// 레스토랑 삭제
	
	// 레스토랑 정보수정
	
	

	/*
	 * // Connection 타입 getConnection 메소드명 SQLException예외처리를 해준다. private Connection
	 * getConnection() throws SQLException { Connection conn = null; // Connection
	 * 변수 선언
	 * 
	 * try { Class.forName("com.mysql.jdbc.Driver"); // DB드라이버 설정
	 * 
	 * String dburl =
	 * "jdbc:mysql://localhost:3306/deliveryfood?characterEncoding=UTF-8&serverTimezone=UTC";
	 * // DB접속 // 주소 // **?characterEncoding=UTF-8&serverTimezone=UTC 버전 업그레이드 되면서
	 * 해당 코드를 뒤에 붙여줘야 // DB연결이 됩니다~!
	 * 
	 * String dbId = "zzoang"; // DB접속 아이디 String dbPw = "123456"; // DB접속 비밀번호 conn
	 * = DriverManager.getConnection(dburl, dbId, dbPw); // 접속DB설정 conn 변수안에 연결할
	 * DB정보를 선언해놓는다. } catch (ClassNotFoundException e) {
	 * System.out.println("드라이버 로딩 실패!"); } return conn; }
	 */
}
