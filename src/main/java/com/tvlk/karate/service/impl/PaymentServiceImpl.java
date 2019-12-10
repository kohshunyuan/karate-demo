package com.tvlk.karate.service.impl;

import com.tvlk.karate.db.enums.PaymentStatus;
import com.tvlk.karate.db.tables.daos.AvailablePaymentOptionDao;
import com.tvlk.karate.db.tables.daos.OrderDao;
import com.tvlk.karate.db.tables.pojos.AvailablePaymentOption;
import com.tvlk.karate.db.tables.pojos.Order;
import com.tvlk.karate.exception.ResourceNotFoundException;
import com.tvlk.karate.model.dto.PaymentRequestDto;
import com.tvlk.karate.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import static java.lang.String.format;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

  private final AvailablePaymentOptionDao optionDao;

  private final OrderDao orderDao;

  public PaymentServiceImpl(AvailablePaymentOptionDao optionDao, OrderDao orderDao) {
    this.optionDao = optionDao;
    this.orderDao = orderDao;
  }

  @Override
  public List<AvailablePaymentOption> getPaymentOption() {
    return optionDao.fetchByActive(Boolean.TRUE);
  }

  @Override
  public Order submitPayment(PaymentRequestDto paymentRequest) throws ResourceNotFoundException {

    if (null == paymentRequest)  {
      throw new IllegalArgumentException("Invalid request [null]");
    }
    Order order = orderDao.fetchOneById(paymentRequest.getOrderId());
    if (Objects.isNull(order)) {
      throw new ResourceNotFoundException(format("Not able to find order with id [%s]", paymentRequest.getOrderId()));
    }
    order.setPaymentOption(paymentRequest.getPaymentOption());
    order.setUpdated(OffsetDateTime.now());
    order.setPaymentStatus(PaymentStatus.SUCCESS);
    orderDao.update(order);
    return order;
  }
}
