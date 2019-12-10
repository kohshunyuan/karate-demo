package com.tvlk.karate.controller;

import com.tvlk.karate.db.enums.PaymentStatus;
import com.tvlk.karate.db.tables.pojos.AvailablePaymentOption;
import com.tvlk.karate.db.tables.pojos.Order;
import com.tvlk.karate.exception.ResourceNotFoundException;
import com.tvlk.karate.model.dto.PaymentRequestDto;
import com.tvlk.karate.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/payment")
@Slf4j
public class PaymentController {

  @Autowired
  private PaymentService paymentService;

  @GetMapping(value = "/options")
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public List<AvailablePaymentOption> getPaymentOptions() {
    return paymentService.getPaymentOption();
  }

  @PostMapping(value = "/submit")
  @ResponseStatus(HttpStatus.OK)
  @ResponseBody
  public Order submitPayment(@RequestBody PaymentRequestDto paymentRequest) throws ResourceNotFoundException {
    return paymentService.submitPayment(paymentRequest);
  }
}
