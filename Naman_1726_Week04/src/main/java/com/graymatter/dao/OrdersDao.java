package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graymatter.model.Customer;
import com.graymatter.model.Orders;

@Component
public class OrdersDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	//CRUD operations
	
	//Get all Orders
		public List<Orders> getAllOrders() {
		String query="select * from orders";
		List<Orders> orderList= jdbcTemplate.query(query, new OrdersRowMapper());
		return orderList;
		}
	//get Order by Orderid
		public Orders getOrderById(int oId){
			String query="select * from orders where order_id="+oId;
			List<Orders> oList= jdbcTemplate.query(query, new OrdersRowMapper());
			return  oList.get(0);
		}	
		
	//get order by CustomerId
		public List<Orders> getOrderByCId(int cId) {
				String query="Select * from orders where customer_id="+cId;
				List<Orders> oList=jdbcTemplate.query(query, new OrdersRowMapper());
				return oList;
			}
		
	//add Order
		public int addOrder(Orders o) {
		String query="insert into orders values("+o.getOrderId()+",'"+o.getOrderDate()+"',"+o.getTotalAmount()+","+o.getCustomerId()+");";
		return jdbcTemplate.update(query);
		}
	//delete order
		public int deleteOrder(int oId) {
		String query="delete from orders where order_id="+oId;
		return jdbcTemplate.update(query);
		}
	//update order
		public int updateOrder(Orders o) {
		String query="update orders set order_date='"+o.getOrderDate()+"', totalAmount="+o.getTotalAmount()+" where order_id="+o.getOrderId()+";";
		return jdbcTemplate.update(query);
		}
}
