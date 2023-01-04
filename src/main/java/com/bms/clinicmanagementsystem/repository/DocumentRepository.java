package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, String> {
}