package com.example.demo1.repo;

import com.example.demo1.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  TicketRepo extends JpaRepository<Ticket,Integer> {
}
