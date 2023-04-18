package com.example.demo1.service;

import com.example.demo1.dto.EventDTO;
import com.example.demo1.entity.Event;
import com.example.demo1.repo.EventRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class EventService {
        @Autowired
        private EventRepo eventRepo;
        @Autowired
        private ModelMapper modelMapper;
        public EventDTO saveEvent(EventDTO eventDTO){
            eventRepo.save(modelMapper.map(eventDTO, Event.class));
            return eventDTO;
        }

        public List<EventDTO> getAllEvents(){
            List<Event>eventList=eventRepo.findAll();
            return modelMapper.map(eventList,new TypeToken<List<EventDTO>>(){}.getType());
        }

        public EventDTO updateEvent(EventDTO eventDTO){
            eventRepo.save(modelMapper.map(eventDTO, Event.class));
            return eventDTO;
        }

        public boolean deleteEvent(EventDTO eventDTO){
            eventRepo.delete(modelMapper.map(eventDTO, Event.class));
            return true;
        }
}
