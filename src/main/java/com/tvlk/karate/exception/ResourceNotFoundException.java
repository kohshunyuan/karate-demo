package com.tvlk.karate.exception;

import lombok.Data;

@Data
public class ResourceNotFoundException extends Throwable {

  /**
   * Create an ResourceNotFoundException with a specific message.
   * @param message the message
   */
  public ResourceNotFoundException(String message) {
    super(message);
  }

  /**
   * Create an ResourceNotFoundException with a specific message and cause.
   * @param message the message
   * @param cause the cause
   */
  public ResourceNotFoundException(String message, Exception cause) {
    super(message, cause);
  }

}
