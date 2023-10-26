package com.customer.task1.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String product;
    private float price;
    private String address;
    private String country;
    private long pinCode;
}
