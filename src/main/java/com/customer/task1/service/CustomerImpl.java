package com.customer.task1.service;

import com.customer.task1.customexception.CustomerAlreadyExistException;
import com.customer.task1.customexception.IdException;
import com.customer.task1.entity.CustomerEnt;
import com.customer.task1.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerImpl implements CustomerInterface {
    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public CustomerEnt save(CustomerEnt customer) {
        return customerRepo.save(customer) ;
    }

    @Override
    public List<CustomerEnt> getAllCustomers() {
        return (List<CustomerEnt>)customerRepo.findAll();    }


    @Override
    public String addCustomer(CustomerEnt customer) {
        CustomerEnt existingCustomer= customerRepo.findById(customer.getId()).orElse(null);
        if (existingCustomer==null){
            customerRepo.save(customer);
            return " customer added successfully" ;
        }
        else {
              throw new CustomerAlreadyExistException("customer already exist");
        }
    }

    @Override
    public String UpdateCustomerById(CustomerEnt customer, Integer id) throws IdException {
        Optional<CustomerEnt>customerData = customerRepo.findById(customer.getId());
        if (customerData.isPresent()){
            customerRepo.save(customerData.get());
        return "customer with id"+customer.getId()+" updated successfully";
        }
        else{
            throw new IdException("given customer id is not present");
        }

    }


    @Override
    public void deleteById(Integer id) {
        customerRepo.deleteById(id);

    }
}
