package com.bootcamp.shoppingcart.appshoppingcart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class CartCheckedOutException extends RuntimeException {

  public CartCheckedOutException(Long idcart) {
    super(String.format("Cart %d is already checked out.",idcart));
  }
}
