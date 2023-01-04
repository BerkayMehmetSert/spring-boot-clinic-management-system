package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.dto.RoleDto;
import com.bms.clinicmanagementsystem.dto.converter.RoleDtoConverter;
import com.bms.clinicmanagementsystem.exception.RoleAlreadyExistException;
import com.bms.clinicmanagementsystem.exception.RoleNotFoundException;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;
import com.bms.clinicmanagementsystem.model.Role;
import com.bms.clinicmanagementsystem.repository.RoleRepository;
import com.bms.clinicmanagementsystem.request.CreateRoleRequest;
import com.bms.clinicmanagementsystem.request.UpdateRoleRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RoleService {
    private final RoleRepository roleRepository;
    private final RoleDtoConverter converter;

    public RoleService(RoleRepository roleRepository,
                       RoleDtoConverter converter) {
        this.roleRepository = roleRepository;
        this.converter = converter;
    }

    public void createRole(final CreateRoleRequest request) {
        Role role = new Role();

        checkIfRoleExists(request.getName());

        role.setName(request.getName());

        roleRepository.save(role);
        log.info(BusinessLogMessage.Role.ROLE_CREATED);
    }

    public void updateRole(final String id, final UpdateRoleRequest request) {
        Role role = findRoleByRoleId(id);

        if (!role.getName().equals(request.getName())) {
            checkIfRoleExists(request.getName());
        }

        role.setName(request.getName());

        roleRepository.save(role);
        log.info(BusinessLogMessage.Role.ROLE_UPDATED + id);
    }

    public void deleteRole(final String id) {
        Role role = findRoleByRoleId(id);

        roleRepository.delete(role);
        log.info(BusinessLogMessage.Role.ROLE_DELETED + id);
    }

    public RoleDto findRoleById(final String id) {
        Role role = findRoleByRoleId(id);

        log.info(BusinessLogMessage.Role.ROLE_FOUND + id);
        return converter.convert(role);
    }

    public List<RoleDto> findAllRoles() {
        List<Role> roles = roleRepository.findAll();

        if (roles.isEmpty()) {
            log.error(BusinessLogMessage.Role.ROLE_LIST_EMPTY);
            throw new RoleNotFoundException(BusinessMessage.Role.ROLE_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.Role.ROLE_LIST_FOUND);
        return converter.convert(roles);
    }

    protected Role findRoleByRoleId(String id) {
        return roleRepository.findById(id).orElseThrow(() -> {
            log.error(BusinessLogMessage.Role.ROLE_NOT_FOUND + id);
            throw new RoleNotFoundException(BusinessMessage.Role.ROLE_NOT_FOUND);
        });
    }

    private void checkIfRoleExists(final String name) {
        if (roleRepository.existsByNameIgnoreCase(name)) {
            log.error(BusinessLogMessage.Role.ROLE_ALREADY_EXISTS + name);
            throw new RoleAlreadyExistException(BusinessMessage.Role.ROLE_ALREADY_EXISTS);
        }
    }
}
