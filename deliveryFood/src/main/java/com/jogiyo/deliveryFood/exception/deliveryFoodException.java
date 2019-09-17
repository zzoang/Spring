package com.jogiyo.deliveryFood.exception;

public class deliveryFoodException extends RuntimeException {
   private static final long serialVersionUID = 1L;

   public deliveryFoodException() {
      super("memberException Occurs");
   }
   
   public deliveryFoodException(String msg) {
      super(msg);
   }
}