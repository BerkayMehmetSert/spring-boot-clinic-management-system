package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.DepartmentDto;
import com.bms.clinicmanagementsystem.model.Department;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentDtoConverter {
    public DepartmentDto convert(Department from) {
        return new DepartmentDto(
                from.getId(),
                from.getName(),
                from.getClinic() == null ? null : from.getClinic().getId()
        );
    }

    public List<DepartmentDto> convert(List<Department> from) {
        return from.stream().map(this::convert).toList();
    }
}
