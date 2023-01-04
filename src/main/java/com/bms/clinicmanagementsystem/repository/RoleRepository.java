package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
    boolean existsByNameIgnoreCase(String name);
}