package com.manageOrder.service;

import java.util.ArrayList;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manageOrder.model.Orders;
import com.manageOrder.repository.OrdersRepository;


@Service
public class OrderService {

	@Autowired
	OrdersRepository ordersRepository; 
	
	public List<Orders> getAllOrders()
	{
		List<Orders> orders = new ArrayList<Orders>();
		ordersRepository.findAll().forEach(orders1->orders.add(orders1));
		return orders;
	}
	
	public Orders getordersById(int id) {
		return ordersRepository.findById(id).get();
	}

	public void saveOrUpdate(Orders orders) {

		ordersRepository.save(orders);
	}

	public void delete(int id) {
		ordersRepository.deleteById(id);
	}

	public void update(Orders orders, int bookid) {

		ordersRepository.save(orders);
	}
	
}
