package com.example.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Event {
    @Id
    private int event_id;
    private String name;
    private float time;
    private String date;
    private String type;
    private String location;
}
