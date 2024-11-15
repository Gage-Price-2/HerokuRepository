package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrdersDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	@Autowired
	public OrdersDataService service;
	private static final Logger logger = LoggerFactory.getLogger(OrdersBusinessService.class);
	
	@Override
	public void test() {
		
		System.out.println("\nHello from the OrdersBusiinessService\n");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		List<OrderEntity> ordersEntity = service.findAll();
		
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity) {
			ordersDomain.add(new OrderModel(entity.getId(), entity.getOrderNo(), entity.getProductName(), entity.getPrice(), entity.getQuantity()));
		}
		logger.atInfo();
		return ordersDomain;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Within the Business init method");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Within the Business destroy method");

	}


}
