package com.tvlk.karate.service.impl;

import com.tvlk.karate.db.tables.daos.OrderDao;
import com.tvlk.karate.db.tables.pojos.Order;
import com.tvlk.karate.service.OrderService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Data
public class OrderServiceImpl implements OrderService {

  @Autowired
  private OrderDao orderDao;

  @Override
  public Order insertOrder(Order order) {
    orderDao.insert(order);
    return orderDao.fetchOneById(order.getId());
  }

  @Override
  public Order getOrderById(int id) {
    return orderDao.fetchOneById(id);
  }
}
