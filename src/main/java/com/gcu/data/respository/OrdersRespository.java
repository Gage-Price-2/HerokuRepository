package com.gcu.data.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gcu.data.entity.OrderEntity;


public interface OrdersRespository extends CrudRepository<OrderEntity, Long>
{

}
