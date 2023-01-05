package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.dto.HasRoleDto;
import com.bms.clinicmanagementsystem.dto.converter.HasRoleDtoConverter;
import com.bms.clinicmanagementsystem.exception.HasRoleNotFoundException;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;
import com.bms.clinicmanagementsystem.model.HasRole;
import com.bms.clinicmanagementsystem.repository.HasRoleRepository;
import com.bms.clinicmanagementsystem.request.hasrole.CreateHasRoleRequest;
import com.bms.clinicmanagementsystem.request.hasrole.UpdateHasRoleRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HasRoleService {
    private final HasRoleRepository hasRoleRepository;
    private final RoleService roleService;
    private final EmployeeService employeeService;
    private final HasRoleDtoConverter converter;

    public HasRoleService(HasRoleRepository hasRoleRepository,
                          RoleService roleService,
                          EmployeeService employeeService,
                          HasRoleDtoConverter converter) {
        this.hasRoleRepository = hasRoleRepository;
        this.roleService = roleService;
        this.employeeService = employeeService;
        this.converter = converter;
    }

    public void createHasRole(final CreateHasRoleRequest request) {
        HasRole hasRole = new HasRole();

        hasRole.setTimeFrom(request.getTimeFrom());
        hasRole.setTimeTo(request.getTimeTo());
        hasRole.setIsActive(true);
        hasRole.setRole(roleService.findRoleByRoleId(request.getRoleId()));
        hasRole.setEmployee(employeeService.findEmployeeByEmployeeId(request.getEmployeeId()));

        hasRoleRepository.save(hasRole);
        log.info(BusinessLogMessage.HasRole.HAS_ROLE_CREATED);
    }

    public void updateHasRole(final String id, final UpdateHasRoleRequest request) {
        HasRole hasRole = findHasRoleByHasRoleId(id);

        hasRole.setTimeFrom(request.getTimeFrom());
        hasRole.setTimeTo(request.getTimeTo());
        hasRole.setRole(roleService.findRoleByRoleId(request.getRoleId()));
        hasRole.setEmployee(employeeService.findEmployeeByEmployeeId(request.getEmployeeId()));

        hasRoleRepository.save(hasRole);
        log.info(BusinessLogMessage.HasRole.HAS_ROLE_UPDATED + id);
    }

    public void changeRole(final String id, final String roleId) {
        HasRole hasRole = findHasRoleByHasRoleId(id);

        hasRole.setRole(roleService.findRoleByRoleId(roleId));

        hasRoleRepository.save(hasRole);
        log.info(BusinessLogMessage.HasRole.HAS_ROLE_UPDATED + id);
    }

    public void deleteHasRole(final String id) {
        HasRole hasRole = findHasRoleByHasRoleId(id);

        hasRole.setIsActive(false);

        hasRoleRepository.save(hasRole);
        log.info(BusinessLogMessage.HasRole.HAS_ROLE_DELETED + id);
    }

    public HasRoleDto findHasRoleById(final String id) {
        HasRole hasRole = findHasRoleByHasRoleId(id);

        log.info(BusinessLogMessage.HasRole.HAS_ROLE_FOUND + id);
        return converter.convert(hasRole);
    }

    public List<HasRoleDto> findAllHasRoles() {
        List<HasRole> hasRoles = hasRoleRepository.findAll().stream()
                .filter(x -> x.getIsActive().equals(true))
                .toList();

        if (hasRoles.isEmpty()) {
            log.info(BusinessLogMessage.HasRole.HAS_ROLE_LIST_EMPTY);
            throw new HasRoleNotFoundException(BusinessMessage.HasRole.HAS_ROLE_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.HasRole.HAS_ROLE_LIST_FOUND);
        return converter.convert(hasRoles);
    }

    protected HasRole findHasRoleByHasRoleId(final String id) {
        return hasRoleRepository.findById(id)
                .filter(x -> x.getIsActive().equals(true))
                .orElseThrow(() -> {
                    log.info(BusinessLogMessage.HasRole.HAS_ROLE_NOT_FOUND + id);
                    return new HasRoleNotFoundException(BusinessMessage.HasRole.HAS_ROLE_NOT_FOUND);
                });
    }
}
