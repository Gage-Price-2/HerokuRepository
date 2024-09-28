package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.OrderEntity;
import com.gcu.data.respository.OrdersRespository;

@Service
public class OrdersDataService implements DataAccessInterface<OrderEntity>
{

	@Autowired
	private OrdersRespository ordersRespository;
	
	public OrdersDataService(OrdersRespository ordersRespository) {
		this.ordersRespository = ordersRespository;
	}
	
	
	@Override
	public List<OrderEntity> findAll() {
		// TODO Auto-generated method stub
		List<OrderEntity> orders = new ArrayList<OrderEntity>();
		
		try
		{
			Iterable<OrderEntity> ordersIterable = ordersRespository.findAll();
			
			ordersIterable.forEach(orders::add);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orders;
	}

	@Override
	public OrderEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(OrderEntity order) {
		// TODO Auto-generated method stub
		try
		{
			this.ordersRespository.save(order);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(OrderEntity t) {
		// TODO Auto-generated method stub
		return false;
	}

}
