package com.manageOrder.repository;

import org.springframework.data.repository.CrudRepository;

import com.manageOrder.model.Orders;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {


}
