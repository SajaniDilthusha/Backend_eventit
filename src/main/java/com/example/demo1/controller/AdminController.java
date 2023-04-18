package com.example.demo1.controller;

import com.example.demo1.dto.AdminDTO;
import com.example.demo1.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;
    @GetMapping("/getAdmins")
    public List<AdminDTO> getAdmin(){
        return adminService.getAllAdmins();
    }

    @PostMapping("/saveAdmin")
    public AdminDTO saveAdmin(@RequestBody AdminDTO adminDTO){
        return adminService.saveAdmin(adminDTO);
    }

    @PutMapping("/updateAdmin")
    public AdminDTO updateAdmin(@RequestBody AdminDTO adminDTO){
        return adminService.updateAdmin(adminDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody AdminDTO adminDTO){
        return adminService.deleteAdmin(adminDTO);
    }
}
