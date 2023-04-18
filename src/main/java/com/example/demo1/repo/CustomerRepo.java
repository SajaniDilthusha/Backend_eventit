package com.example.demo1.repo;

import com.example.demo1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    }
