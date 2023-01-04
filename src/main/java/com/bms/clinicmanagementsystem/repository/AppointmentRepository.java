package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, String> {
}