package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;

public record EmployeeInDepartmentDto(
    String id,
    LocalDateTime timeFrom,
    LocalDateTime timeTo,
    Boolean isActive,
    String departmentId
) {
}
