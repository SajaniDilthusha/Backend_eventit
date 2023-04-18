package com.example.demo1.repo;

import com.example.demo1.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepo extends JpaRepository<Organization,Integer> {
}
