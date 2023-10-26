package com.customer.task1.exceptionhandling;

import com.customer.task1.customexception.CustomerAlreadyExistException;
import com.customer.task1.customexception.IdException;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.boot.context.config.ConfigDataNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = CustomerAlreadyExistException.class)
    public String getCustomerException(CustomerAlreadyExistException c ){
        return c.getMessage();
    }
    @ExceptionHandler(value = IdException.class)
    public String getIdException(IdException id){
        return id.getMessage();
    }
    @ExceptionHandler(value = ConfigDataNotFoundException.class)
    public  String getDataNotFound(ConfigDataNotFoundException data){
        return "data not found";
    }
}
