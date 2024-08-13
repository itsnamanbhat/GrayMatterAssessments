package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.OrdersDao;
import com.graymatter.model.Customer;
import com.graymatter.model.Orders;

@Service
public class OrderService {
	
	@Autowired
	public OrdersDao odao;
	
	public List<Orders> getAllOrders(){
		return odao.getAllOrders();
	}
	
	public Orders getByOrderId(int oId){
		return odao.getOrderById(oId);
	}
	
	public int addOrder(Orders o) {
		return odao.addOrder(o);
	}
	
	public int deleteOrder(int oId) {
		return odao.deleteOrder(oId);
	}
	
	public int updateOrder(Orders o) {
		return odao.updateOrder(o);
	}
	
	public List<Orders> getOrderByCustomerId(int cId){
		return odao.getOrderByCId(cId);
	}
}
