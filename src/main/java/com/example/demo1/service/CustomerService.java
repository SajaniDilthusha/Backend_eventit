package com.example.demo1.service;

import com.example.demo1.dto.CustomerDTO;
import com.example.demo1.entity.Customer;
import com.example.demo1.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    public CustomerDTO saveCustomer(CustomerDTO customerDTO){
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        return customerDTO;
    }

    public List<CustomerDTO> getAllCustomers(){
        List<Customer>customerList=customerRepo.findAll();
        return modelMapper.map(customerList,new TypeToken<List<CustomerDTO>>(){}.getType());
    }

    public CustomerDTO updateCustomer(CustomerDTO customerDTO){
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        return customerDTO;
    }

    public boolean deleteCustomer(CustomerDTO customerDTO){
       customerRepo.delete(modelMapper.map(customerDTO, Customer.class));
        return true;
    }
}
