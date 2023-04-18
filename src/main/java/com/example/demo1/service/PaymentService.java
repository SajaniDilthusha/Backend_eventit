package com.example.demo1.service;

import com.example.demo1.dto.CustomerDTO;
import com.example.demo1.dto.PaymentDTO;
import com.example.demo1.entity.Customer;
import com.example.demo1.entity.Payment;
import com.example.demo1.repo.CustomerRepo;
import com.example.demo1.repo.PaymentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public PaymentDTO savePayment(PaymentDTO paymentDTO){
        paymentRepo.save(modelMapper.map(paymentDTO, Payment.class));
        return paymentDTO;
    }

    public List<PaymentDTO> getAllPayments(){
        List<Payment>paymentList=paymentRepo.findAll();
        return modelMapper.map(paymentList,new TypeToken<List<PaymentDTO>>(){}.getType());
    }

    public PaymentDTO updatePayment(PaymentDTO paymentDTO){
        paymentRepo.save(modelMapper.map(paymentDTO, Payment.class));
        return paymentDTO;
    }

    public boolean deletePayment(PaymentDTO paymentDTO){
        paymentRepo.delete(modelMapper.map(paymentDTO, Payment.class));
        return true;
    }

}
