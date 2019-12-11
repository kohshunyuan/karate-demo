package com.tvlk.karate.service;

import com.tvlk.karate.db.tables.pojos.Order;

import java.util.List;

public interface OrderService {
  Order insertOrder(Order order);

  Order getOrderById(int id);

  List<Order> getAllOrders();
  
}
