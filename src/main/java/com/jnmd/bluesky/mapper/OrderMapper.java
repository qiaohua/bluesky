package com.jnmd.bluesky.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jnmd.bluesky.domain.Order;

@Repository
public interface OrderMapper {

	public List<Order> getOrders();//获取工单
	public Order getOrder(int o_id);//获取工单详情
	public List<Order> getOrderByType(int ty_id);//获取指定id
	public void insertOrder(Order order);//发布工单
}
