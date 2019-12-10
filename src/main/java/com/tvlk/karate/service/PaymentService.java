package com.tvlk.karate.service;

import com.tvlk.karate.db.tables.pojos.AvailablePaymentOption;
import com.tvlk.karate.db.tables.pojos.Order;
import com.tvlk.karate.exception.ResourceNotFoundException;
import com.tvlk.karate.model.dto.PaymentRequestDto;

import java.util.List;

public interface PaymentService {

  List<AvailablePaymentOption> getPaymentOption();

  Order submitPayment(PaymentRequestDto paymentRequest) throws ResourceNotFoundException;
}
