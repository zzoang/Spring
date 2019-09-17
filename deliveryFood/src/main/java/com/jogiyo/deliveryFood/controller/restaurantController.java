package com.jogiyo.deliveryFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jogiyo.deliveryFood.controller.restaurant.*;
import com.jogiyo.deliveryFood.service.restaurantService;

@Controller
@RequestMapping("/restaurant")
public class restaurantController {


	@Autowired
	private restaurantDAO restaurantDAO;
	@Autowired
	private restaurantService restaurantService; 
	
	
	//레스토랑 등록
	@RequestMapping(value="/entollment", method = RequestMethod.GET)
	public String Entollment() {
		return "/restaurant/entollment";
	}
	

	//레스토랑 등록 액션
	@RequestMapping(value="/entollmentAction", method = RequestMethod.POST)
	public String restaurantEntollment(restaurantVO vo) {
		boolean rs = restaurantService.entollment(vo);
		if(rs == true)
			return "redirect:/restaurant/restaurant";
		else
			return "redirect:/restaurant/entollment";
	}

}
