package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.EmployeeInDepartmentDto;
import com.bms.clinicmanagementsystem.model.InDepartment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeInDepartmentDtoConverter {
    public EmployeeInDepartmentDto convert(InDepartment from) {
        return new EmployeeInDepartmentDto(
                from.getId(),
                from.getTimeFrom(),
                from.getTimeTo(),
                from.getIsActive(),
                from.getDepartment() != null ? from.getDepartment().getId() : null
        );
    }

    public List<EmployeeInDepartmentDto> convert(List<InDepartment> from) {
        return from.stream().map(this::convert).toList();
    }
}
