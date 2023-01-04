package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.StatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusHistoryRepository extends JpaRepository<StatusHistory, String> {
}