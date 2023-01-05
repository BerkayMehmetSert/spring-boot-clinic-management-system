package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, String> {
    boolean existsByNameIgnoreCase(String name);
}