package com.graymatter.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Customer;
import com.graymatter.model.Orders;
import com.graymatter.service.CustomerService;
import com.graymatter.service.OrderService;

@Controller
public class CustomerController {
	@Autowired
	public CustomerService cService;
	
	@Autowired
	public OrderService oService;
	
	
	@RequestMapping("/doSignUp")
	public String start() {
		return "signup";
	}
	@RequestMapping("/goToLogin")
	public String directLogin() {
		return "login";
	}
	
	@RequestMapping("/doLogin")
	public ModelAndView Signup(@RequestParam String id,@RequestParam String name,@RequestParam String email,@RequestParam String password) {
		cService.addCustomer(new Customer(Integer.parseInt(id),name,email,password));
		ModelAndView mv= new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/loggedIn")
	public ModelAndView login(@RequestParam String email,@RequestParam String password,HttpSession session) {
//		Customer c1=cService.getByCustomerId(Integer.parseInt(id));
		Customer c1=cService.getByEmail(email);
		
		ModelAndView mv= null;
		if(c1.getCPwd().equals(password)) {		
			mv=new ModelAndView("customerDash");
			session.setAttribute("customerId", c1.getCId());
			String cName=c1.getCName();
			int cId= c1.getCId();
			mv.addObject("name",cName);
			mv.addObject("id1",cId);
			return mv;
		}else
			mv=new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping("/addOrder")
	public String goToAdding() {
		return "addOrder";
	}
	
	@RequestMapping("/add")
	public ModelAndView addOrder(@RequestParam String orderId,@RequestParam String totalAmount,HttpSession session) {
		ModelAndView mv= new ModelAndView("customerDash");
		Integer id= (Integer)session.getAttribute("customerId");
		LocalDate localDate = LocalDate.now();
        Date sqlDate = Date.valueOf(localDate);
		oService.addOrder(new Orders(Integer.parseInt(orderId),sqlDate,Double.parseDouble(totalAmount),id));
		return mv;
		
	}
	@RequestMapping("/deleteOrder")
	public ModelAndView goToDelete(HttpSession session) {
		ModelAndView mv= new ModelAndView("deleteOrder");
		Integer id= (Integer)session.getAttribute("customerId");
		List<Orders> orderList= oService.getOrderByCustomerId(id);
		mv.addObject("olist",orderList);
		return mv;
	}
	@RequestMapping("/updateOrder")
	public String goToupdate() {
		return "updateOrder";
	}
	
	@RequestMapping("/getOrder")
	public ModelAndView goToGet(HttpSession session) {
		Integer id= (Integer)session.getAttribute("customerId");
		ModelAndView mv=new ModelAndView("getOrders");
		List<Orders> orderList= oService.getOrderByCustomerId(id);
		mv.addObject("olist",orderList);
		return mv;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteOrder(@RequestParam String id1,HttpSession session) {
		ModelAndView mv= new ModelAndView("customerDash");
		oService.deleteOrder(Integer.parseInt(id1));
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateOrder(@RequestParam String oId,@RequestParam String totalAmt,HttpSession session) {
		LocalDate localDate = LocalDate.now();
        Date sqlDate = Date.valueOf(localDate);
		ModelAndView mv= new ModelAndView("customerDash");
		Integer id= (Integer)session.getAttribute("customerId");
		oService.updateOrder(new Orders( Integer.parseInt(oId),sqlDate,Double.parseDouble(totalAmt),id));
		return mv;
	}
	
	
}
