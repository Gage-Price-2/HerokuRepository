package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private OrdersBusinessServiceInterface service;
	@Autowired
	private SecurityBusinessService security;

	@RequestMapping("/")
	public String display(Model model) {
		//Display login form view
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		service.test();
		security.authenticate("gage", "price");
		//Check for validation errors
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		//Create some orders
		//List<OrderModel> orders = new ArrayList<OrderModel>();
		
		/*orders.add(new OrderModel(1, "0000000000", "This is Product 1", 1, 1));
		orders.add(new OrderModel(2, "0000000001", "This is Product 2", 2, 2));
		orders.add(new OrderModel(3, "0000000002", "This is Product 3", 3, 3));
		orders.add(new OrderModel(4, "0000000003", "This is Product 4", 4, 4));
		orders.add(new OrderModel(5, "0000000004", "This is Product 5", 5, 5));
		orders.add(new OrderModel(6, "0000000005", "This is Product 6", 6, 6));
		orders.add(new OrderModel(7, "0000000006", "This is Product 7", 7, 7));
		orders.add(new OrderModel(8, "0000000007", "This is Product 8", 8, 8));
		orders.add(new OrderModel(9, "0000000008", "This is Product 9", 9, 9));
		orders.add(new OrderModel(10, "0000000009", "This is Product 10", 10, 10));
		orders.add(new OrderModel(100, "0000000100", "This is Product 100", 100, 100));*/
		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", service.getOrders());
		//model.addAttribute("orders", orders);
		return "orders";
		
		
	}
}
