package com.example.demo1.controller;

import com.example.demo1.dto.CustomerDTO;
import com.example.demo1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/payment")
@CrossOrigin

public class PaymentController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<CustomerDTO> getCustomer(){

        return customerService.getAllCustomers();
    }

    @PostMapping("/saveCustomer")
    public CustomerDTO saveUser(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }

    @PutMapping("/updateCustomer")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO ){
        return customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping("/deleteCustomer")
    public boolean deleteCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.deleteCustomer(customerDTO);
    }
}
