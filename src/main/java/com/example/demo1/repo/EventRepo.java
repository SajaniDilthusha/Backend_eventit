package com.example.demo1.repo;

import com.example.demo1.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event,Integer> {
}
