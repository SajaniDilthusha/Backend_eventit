package com.example.demo1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDTO {
    private int event_id;
    private String name;
    private float time;
    private String date;
    private String type;
    private String location;
}
