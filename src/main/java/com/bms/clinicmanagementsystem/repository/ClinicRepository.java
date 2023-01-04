package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, String> {
}