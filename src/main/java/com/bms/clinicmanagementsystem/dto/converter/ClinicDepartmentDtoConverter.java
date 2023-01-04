package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.ClinicDepartmentDto;
import com.bms.clinicmanagementsystem.model.Department;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClinicDepartmentDtoConverter {
    public ClinicDepartmentDto convert(Department from) {
        return new ClinicDepartmentDto(
                from.getId(),
                from.getName()
        );
    }

    public List<ClinicDepartmentDto> convert(List<Department> from) {
        return from.stream().map(this::convert).toList();
    }
}
