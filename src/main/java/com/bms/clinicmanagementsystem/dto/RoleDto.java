package com.bms.clinicmanagementsystem.dto;

import java.util.List;

public record RoleDto(
    String id,
    String name,
    List<RoleHasRoleDto> hasRoles
) {
}
