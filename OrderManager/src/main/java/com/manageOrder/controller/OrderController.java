package com.manageOrder.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manageOrder.model.Orders;
import com.manageOrder.service.OrderService;

@RestController 
public class OrderController {

	private static final String MESSAGE_QUEUE = "orders_queue";
	@Autowired
	OrderService orderService;

	  private final JmsTemplate jmsTemplate;

	  public OrderController(JmsTemplate jmsTemplate) {
	    this.jmsTemplate = jmsTemplate;
	  }
	
	//view all orders
	@GetMapping("/view-order")
	private List<Orders> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	//add order
	@PostMapping(path="/order", consumes = {"application/json"})
	private int saveOrder(@RequestBody Orders orders) {

		orderService.saveOrUpdate(orders);
		jmsTemplate.convertAndSend(MESSAGE_QUEUE, orders);
		return orders.getId();
	}
	
}
