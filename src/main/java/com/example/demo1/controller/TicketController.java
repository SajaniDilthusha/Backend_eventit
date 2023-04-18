package com.example.demo1.controller;

import com.example.demo1.dto.TicketDTO;
import com.example.demo1.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/ticket")
@CrossOrigin

public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/getTickets")
    public List<TicketDTO> getTicket(){

        return ticketService.getAllTickets();
    }

    @PostMapping("/saveTicket")
    public TicketDTO saveTicket(@RequestBody TicketDTO ticketDTO){

        return ticketService.saveTicket(ticketDTO);
    }

    @PutMapping("/updateTicket")
    public TicketDTO updateTicket(@RequestBody TicketDTO ticketDTO ){

        return ticketService.updateTicket(ticketDTO);
    }

    @DeleteMapping("/deleteTicket")
    public boolean deleteTicket(@RequestBody TicketDTO ticketDTO){

        return ticketService.deleteTicket(ticketDTO);
    }
}

