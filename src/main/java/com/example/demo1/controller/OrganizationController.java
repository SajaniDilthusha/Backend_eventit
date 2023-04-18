package com.example.demo1.controller;

import com.example.demo1.dto.OrganizationDTO;
import com.example.demo1.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/organization")
@CrossOrigin

public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;
    @GetMapping("/getOrganizations")
    public List<OrganizationDTO> getOrganization(){
        return organizationService.getAllOrganizations();
    }

    @PostMapping("/saveOrganization")
    public OrganizationDTO saveOrganization(@RequestBody OrganizationDTO organizationDTO){
        return organizationService.saveOrganization(organizationDTO);
    }

    @PutMapping("/updateOrganization")
    public OrganizationDTO updateOrganization(@RequestBody OrganizationDTO organizationDTO){
        return organizationService.updateOrganization(organizationDTO);
    }
}
