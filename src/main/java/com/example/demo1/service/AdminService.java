package com.example.demo1.service;

import com.example.demo1.dto.AdminDTO;
import com.example.demo1.entity.Admin;
import com.example.demo1.repo.AdminRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private ModelMapper modelMapper;
    public AdminDTO saveAdmin(AdminDTO adminDTO){
        adminRepo.save(modelMapper.map(adminDTO, Admin.class));
        return adminDTO;
    }

    public List<AdminDTO> getAllAdmins(){
        List<Admin> adminList = adminRepo.findAll();
        return modelMapper.map(adminList,new TypeToken<List<AdminDTO>>(){}.getType());
    }

    public AdminDTO updateAdmin(AdminDTO adminDTO){
        adminRepo.save(modelMapper.map(adminDTO, Admin.class));
        return adminDTO;
    }

    public boolean deleteAdmin(AdminDTO adminDTO){
        adminRepo.delete(modelMapper.map(adminDTO, Admin.class));
        return true;
    }
}
