package com.jnmd.bluesky.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jnmd.bluesky.domain.Order;
import com.jnmd.bluesky.exception.OrderException;
import com.jnmd.bluesky.mapper.OrderMapper;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class OrderService {

	@Resource
	private OrderMapper orderMapper;
	
	//工单展示
	public List<Order> getOrdersService(){
		List<Order> orders = orderMapper.getOrders();
		return orders;
	}
	
	//工单类别
	public Order getOrderService(int o_id){
		return orderMapper.getOrder(o_id);
	}
	
	//工单详情
	public List<Order> getOrderByTypeSer(int ty_id){
		return orderMapper.getOrderByType(ty_id);
	}
	
	//发布工单
	@Transactional(rollbackFor=OrderException.class)
	public void insertOrderService(Order order){
		orderMapper.insertOrder(order);
	}
}
