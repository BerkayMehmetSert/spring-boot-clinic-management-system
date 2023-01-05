package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentTypeRepository extends JpaRepository<DocumentType, String> {
    boolean existsByNameIgnoreCase(String name);
}