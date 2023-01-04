package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.PatientCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientCaseRepository extends JpaRepository<PatientCase, String> {
}