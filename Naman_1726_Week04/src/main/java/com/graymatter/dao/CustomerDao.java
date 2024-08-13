package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graymatter.model.Customer;

@Component
public class CustomerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	//CRUD operations
	
	//Get all customers
	
	public List<Customer> getAllCustomers() {
	String query="select * from customer";
	List<Customer> custList= jdbcTemplate.query(query, new CustomerRowMapper());
	return custList;
	}
	//get Customer by id
	public Customer getCustomerById(int cId){
		String query="select * from customer where cust_id="+cId;
		List<Customer> cList= jdbcTemplate.query(query, new CustomerRowMapper());
		return  cList.get(0);
	}
	
	//get Customer by email
	public Customer getCustPasswod(String cEmail) {
		String query="select * from customer where cust_email = '"+cEmail+"'";
		System.out.println(query);
		List<Customer> cList1=jdbcTemplate.query(query,new CustomerRowMapper());
		return cList1.get(0);
	}
	//insert/add customer
	public int addCustomer(Customer c) {
	String query="insert into customer values("+c.getCId()+",'"+c.getCName()+"','"+c.getCEmail()+"','"+c.getCPwd()+"');";
	return jdbcTemplate.update(query);
	}
	//delete customer
	public int deleteCustomer(int cId) {
	String query="delete from customer where cust_id="+cId;
	return jdbcTemplate.update(query);
	}
	//update cutomer
	public int updateCustomer(Customer c) {
	String query="update customer set cust_name='"+c.getCName()+"', cust_email='"+c.getCEmail()+"' where cust_id="+c.getCId();
	return jdbcTemplate.update(query);
	}
}
