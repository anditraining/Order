package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.models.Address;
import com.example.demo.models.Order;

@Service
public class OrderService {
	
	final static Logger logger = LoggerFactory.getLogger(OrderService.class);
	
	public int create() {
		return 1;
	}

	public Order getOrder() {
		Order order = new Order();
		order.setId(1);
		order.setItem("laptop");
		order.setPrice(150f);
		List<Address> list = new ArrayList<>();
		Address communication = new Address();
		communication.setStreet("avenue");
		communication.setPin("123");
		list.add(communication);
		Address delivery = new Address();
		communication.setStreet("avenue2");
		communication.setPin("12345");
		list.add(delivery);
		order.setAddresses(list);
		return order;
	}
	
	public List<Order> getOrders() {
		Order order = new Order();
		order.setId(1);
		order.setItem("laptop");
		order.setPrice(150f);
		List<Address> list = new ArrayList<>();
		Address communication = new Address();
		communication.setStreet("avenue");
		communication.setPin("123");
		list.add(communication);
		Address delivery = new Address();
		communication.setStreet("avenue2");
		communication.setPin("12345");
		list.add(delivery);
		order.setAddresses(list);
		List<Order> orders = new ArrayList<>();
		orders.add(order);
		return orders;
	}

}
