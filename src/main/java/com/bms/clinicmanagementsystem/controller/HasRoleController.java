package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.HasRoleDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.hasrole.CreateHasRoleRequest;
import com.bms.clinicmanagementsystem.request.hasrole.UpdateHasRoleRequest;
import com.bms.clinicmanagementsystem.service.HasRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/has-roles")
@Slf4j
public class HasRoleController {
    private final HasRoleService hasRoleService;

    public HasRoleController(HasRoleService hasRoleService) {
        this.hasRoleService = hasRoleService;
    }

    @PostMapping
    public ResponseEntity<Void> createHasRole(@RequestBody CreateHasRoleRequest request) {
        hasRoleService.createHasRole(request);

        log.info(ControllerLogMessage.HasRole.HAS_ROLE_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateHasRole(@PathVariable String id,
                                              @RequestBody UpdateHasRoleRequest request) {
        hasRoleService.updateHasRole(id, request);

        log.info(ControllerLogMessage.HasRole.HAS_ROLE_UPDATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/role")
    public ResponseEntity<Void> changeRole(@PathVariable String id,
                                           @RequestParam String roleId) {
        hasRoleService.changeRole(id, roleId);

        log.info(ControllerLogMessage.HasRole.HAS_ROLE_UPDATE);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHasRole(@PathVariable String id) {
        hasRoleService.deleteHasRole(id);

        log.info(ControllerLogMessage.HasRole.HAS_ROLE_DELETE);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HasRoleDto> findHasRoleById(@PathVariable String id) {
        HasRoleDto hasRole = hasRoleService.findHasRoleById(id);

        log.info(ControllerLogMessage.HasRole.HAS_ROLE_FIND);
        return ResponseEntity.ok(hasRole);
    }

    @GetMapping
    public ResponseEntity<List<HasRoleDto>> findAllHasRoles() {
        List<HasRoleDto> hasRoles = hasRoleService.findAllHasRoles();

        log.info(ControllerLogMessage.HasRole.HAS_ROLE_FIND_ALL);
        return ResponseEntity.ok(hasRoles);
    }
}
