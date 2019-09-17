package com.jogiyo.deliveryFood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogiyo.deliveryFood.controller.restaurant.restaurantDAO;
import com.jogiyo.deliveryFood.controller.restaurant.restaurantVO;

@Service
public class restaurantService {
	
	@Autowired
	private restaurantDAO restaurantDAO;
	
	
	// 레스토랑 등록
	public boolean entollment(restaurantVO vo) {
		
		int result = restaurantDAO.entollment(vo);
		
		if( result == 1) {
			System.out.println("레스토랑 등록성공");
			return true;
		}
		else if(result == 0) {
			System.out.println("이미 존재하는 레스토랑입니다");
		}
		else if(result == -1) {
			System.out.println("레스토랑 등록 실패");
		}
		return false;	
	}

}
