package com.tvlk.karate.service;

import com.tvlk.karate.db.tables.pojos.Order;

public interface OrderService {
  Order insertOrder(Order order);

  Order getOrderById(int id);
}
