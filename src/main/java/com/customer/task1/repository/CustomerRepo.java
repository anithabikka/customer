package com.customer.task1.repository;

import com.customer.task1.entity.CustomerEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerEnt,Integer> {

}
