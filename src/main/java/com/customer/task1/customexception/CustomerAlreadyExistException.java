package com.customer.task1.customexception;

public class CustomerAlreadyExistException extends RuntimeException{
    public CustomerAlreadyExistException(String message) {
        super(message);
    }
}
