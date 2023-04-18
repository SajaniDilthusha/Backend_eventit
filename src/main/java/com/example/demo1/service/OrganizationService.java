package com.example.demo1.service;


import com.example.demo1.dto.OrganizationDTO;
import com.example.demo1.entity.Organization;
import com.example.demo1.repo.OrganizationRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional

public class OrganizationService {
        @Autowired
        private OrganizationRepo organizationRepo;
        @Autowired
        private ModelMapper modelMapper;
        public OrganizationDTO saveOrganization(OrganizationDTO organizationDTO){
            organizationRepo.save(modelMapper.map(organizationDTO, Organization.class));
            return organizationDTO;
        }

        public List<OrganizationDTO> getAllOrganizations(){
            List<Organization> organizationList = organizationRepo.findAll();
            return modelMapper.map(organizationList,new TypeToken<List<OrganizationDTO>>(){}.getType());
        }

        public OrganizationDTO updateOrganization(OrganizationDTO organizationDTO){
            organizationRepo.save(modelMapper.map(organizationDTO, Organization.class));
            return organizationDTO;
        }

        public boolean deleteOrganization(OrganizationDTO organizationDTO){
            organizationRepo.delete(modelMapper.map(organizationDTO, Organization.class));
            return true;
        }
}
