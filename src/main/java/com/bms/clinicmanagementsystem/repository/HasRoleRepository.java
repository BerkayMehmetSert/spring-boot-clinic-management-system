package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.HasRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HasRoleRepository extends JpaRepository<HasRole, String> {
}