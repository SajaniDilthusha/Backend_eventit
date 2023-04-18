package com.example.demo1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrganizationDTO {
    private int org_id;
    private  String name;
    private int phone_no;
    private String email;
}
