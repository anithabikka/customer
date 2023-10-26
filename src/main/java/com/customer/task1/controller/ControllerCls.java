package com.customer.task1.controller;

import com.customer.task1.entity.CustomerEnt;
import com.customer.task1.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerCls {
    @Autowired
    CustomerRepo customerRepo;
    @PostMapping("/customerdetails")
    public CustomerEnt save(@RequestBody CustomerEnt customer){
        return customerRepo.save(customer);
    }
    @GetMapping("/allcustomers")
    public List<CustomerEnt>getAllCustomers() {
        return customerRepo.findAll();
    }
    @PostMapping("/add")
    public CustomerEnt addCustomers(@RequestBody CustomerEnt customer){
        return customerRepo.save(customer);

    }
    @PutMapping("/custom/{id}")
    public CustomerEnt UpdateCustomerById(@RequestBody CustomerEnt customer , @PathVariable("id") Integer id){
        return customerRepo.save(customer);
    }
    @DeleteMapping("/costomerid/{id}")
    public String deleteById(@PathVariable Integer id){
        customerRepo.deleteById(id);
      return   " successfully deleted";
    }
}
