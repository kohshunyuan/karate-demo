package com.tvlk.karate.model.dto;

import com.tvlk.karate.db.enums.PaymentOption;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentRequestDto {

  private int orderId;
  private PaymentOption paymentOption;
}
