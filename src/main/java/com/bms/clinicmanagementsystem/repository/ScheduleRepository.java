package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, String> {
}