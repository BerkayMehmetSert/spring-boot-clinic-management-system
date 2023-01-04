package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.EmployeeDto;
import com.bms.clinicmanagementsystem.model.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDtoConverter {
    private final EmployeeHasRoleDtoConverter employeeHasRoleDtoConverter;
    private final EmployeeInDepartmentDtoConverter employeeInDepartmentDtoConverter;

    public EmployeeDtoConverter(EmployeeHasRoleDtoConverter employeeHasRoleDtoConverter,
                                EmployeeInDepartmentDtoConverter employeeInDepartmentDtoConverter) {
        this.employeeHasRoleDtoConverter = employeeHasRoleDtoConverter;
        this.employeeInDepartmentDtoConverter = employeeInDepartmentDtoConverter;
    }

    public EmployeeDto convert(Employee from){
        return new EmployeeDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getUsername(),
                from.getPassword(),
                from.getEmail(),
                from.getPhone(),
                from.getIsActive(),
                from.getHasRoles() != null ? employeeHasRoleDtoConverter.convert(from.getHasRoles()) : null,
                from.getInDepartments() != null ? employeeInDepartmentDtoConverter.convert(from.getInDepartments()) : null
        );
    }

    public List<EmployeeDto> convert(List<Employee> from){
        return from.stream().map(this::convert).toList();
    }
}
