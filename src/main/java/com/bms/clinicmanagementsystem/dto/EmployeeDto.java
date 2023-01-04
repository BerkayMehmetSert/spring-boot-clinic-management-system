package com.bms.clinicmanagementsystem.dto;

import java.util.List;

public record EmployeeDto(
    String id,
    String firstName,
    String lastName,
    String username,
    String password,
    String email,
    String phone,
    Boolean isActive,
    List<EmployeeHasRoleDto> hasRoles,
    List<EmployeeInDepartmentDto> inDepartments
) {
}
