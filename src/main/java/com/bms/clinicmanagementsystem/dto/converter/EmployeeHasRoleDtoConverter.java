package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.EmployeeHasRoleDto;
import com.bms.clinicmanagementsystem.model.HasRole;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHasRoleDtoConverter {
    public EmployeeHasRoleDto convert(HasRole from) {
        return new EmployeeHasRoleDto(
                from.getId(),
                from.getTimeFrom(),
                from.getTimeTo(),
                from.getIsActive(),
                from.getRole() != null ? from.getRole().getId() : null
        );
    }

    public List<EmployeeHasRoleDto> convert(List<HasRole> from) {
        return from.stream().map(this::convert).toList();
    }
}
