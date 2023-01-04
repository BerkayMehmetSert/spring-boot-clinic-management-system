package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.RoleDto;
import com.bms.clinicmanagementsystem.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoleDtoConverter {
    private final RoleHasRoleDtoConverter hasRoleDtoConverter;

    public RoleDtoConverter(RoleHasRoleDtoConverter hasRoleDtoConverter) {
        this.hasRoleDtoConverter = hasRoleDtoConverter;
    }

    public RoleDto convert(Role from) {
        return new RoleDto(
                from.getId(),
                from.getName(),
                from.getHasRoles() != null ? hasRoleDtoConverter.convert(from.getHasRoles()) : null
        );
    }

    public List<RoleDto> convert(List<Role> from) {
        return from.stream().map(this::convert).toList();
    }
}
