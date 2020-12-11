package com.example.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Order;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@PostMapping
	public int createOrder(String order) {
		logger.debug("creating an oorder");
		return orderService.create();
	}
	
	@GetMapping("/{id}")
	public Order getOrder(@PathVariable String id) {
		return orderService.getOrder();
	}
	
	@GetMapping
	public List<Order> getOrders() {
		return orderService.getOrders();
	}
	
	

}
