package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.CustomerDao;
import com.graymatter.model.Customer;

@Service
public class CustomerService {
	@Autowired
	public CustomerDao cdao;
	
	public List<Customer> getAllCustomers(){
		return cdao.getAllCustomers();
	}
	
	public Customer getByCustomerId(int cId){
		return cdao.getCustomerById(cId);
	}
	
	public int addCustomer(Customer c) {
		return cdao.addCustomer(c);
	}
	
	public int deleteCustomer(int cId) {
		return cdao.deleteCustomer(cId);
	}
	
	public int updateCustomer(Customer c) {
		return cdao.updateCustomer(c);
	}
	
	public Customer getByEmail(String email) {
		return cdao.getCustPasswod(email);
	}
}
