package com.example.demo1.service;

import com.example.demo1.dto.CustomerDTO;
import com.example.demo1.dto.TicketDTO;
import com.example.demo1.entity.Customer;
import com.example.demo1.entity.Ticket;
import com.example.demo1.repo.CustomerRepo;
import com.example.demo1.repo.TicketRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    @Autowired
    private ModelMapper modelMapper;

    public TicketDTO saveTicket(TicketDTO ticketDTO){
        ticketRepo.save(modelMapper.map(ticketDTO, Ticket.class));
        return ticketDTO;
    }

    public List<TicketDTO> getAllTickets(){
        List<Ticket>ticketList=ticketRepo.findAll();
        return modelMapper.map(ticketList,new TypeToken<List<TicketDTO>>(){}.getType());
    }

    public TicketDTO updateTicket(TicketDTO ticketDTO){
        ticketRepo.save(modelMapper.map(ticketDTO, Ticket.class));
        return ticketDTO;
    }

    public boolean deleteTicket(TicketDTO ticketDTO){
        ticketRepo.delete(modelMapper.map(ticketDTO, Ticket.class));
        return true;
    }
}
