package com.bms.clinicmanagementsystem.repository;

import com.bms.clinicmanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    boolean existsByUsername(String username);
}