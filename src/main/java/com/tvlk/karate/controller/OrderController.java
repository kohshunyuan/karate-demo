package com.tvlk.karate.controller;

import com.tvlk.karate.db.tables.pojos.Order;
import com.tvlk.karate.service.OrderService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Data
@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @RequestMapping(method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
  @ResponseBody
  @ResponseStatus(HttpStatus.CREATED)
  public Order createOrder(@RequestBody Order order) {
     return orderService.insertOrder(order);
  }

  @RequestMapping(value = "/{order_id}", method = RequestMethod.GET)
  @ResponseBody
  @ResponseStatus(HttpStatus.OK)
  public Order getOrder(@PathVariable(name = "order_id") int id) {
    return orderService.getOrderById(id);
  }
}
