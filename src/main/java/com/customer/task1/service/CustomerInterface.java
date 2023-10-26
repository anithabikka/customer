package com.customer.task1.service;

import com.customer.task1.customexception.IdException;
import com.customer.task1.entity.CustomerEnt;

import java.util.List;

public interface CustomerInterface {
    CustomerEnt save(CustomerEnt customer);
    List<CustomerEnt> getAllCustomers();
    String addCustomer(CustomerEnt customer);
    String UpdateCustomerById(CustomerEnt customer, Integer id) throws IdException;
    void  deleteById(Integer id);

}
