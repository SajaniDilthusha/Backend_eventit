package com.example.demo1.controller;

import com.example.demo1.dto.EventDTO;
import com.example.demo1.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "api/v1/event")
@CrossOrigin

public class EventController {
        @Autowired
        private EventService eventService;
        @GetMapping("/getEvents")
        public List<EventDTO> getEvent(){

            return eventService.getAllEvents();
        }

        @PostMapping("/saveEvent")
        public EventDTO saveUser(@RequestBody EventDTO eventDTO){
            return eventService.saveEvent(eventDTO);
        }

        @PutMapping("/updateEvent")
        public EventDTO updateEvent(@RequestBody EventDTO eventDTO ){
            return eventService.updateEvent(eventDTO);
        }

        @DeleteMapping("/deleteEvent")
        public boolean deleteEvent(@RequestBody EventDTO eventDTO){
            return eventService.deleteEvent(eventDTO);
        }
}
