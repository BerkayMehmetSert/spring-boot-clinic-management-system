package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.RoleDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.role.CreateRoleRequest;
import com.bms.clinicmanagementsystem.request.role.UpdateRoleRequest;
import com.bms.clinicmanagementsystem.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
@Slf4j
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public ResponseEntity<Void> createRole(@RequestBody CreateRoleRequest request){
        roleService.createRole(request);

        log.info(ControllerLogMessage.Role.ROLE_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateRole(@PathVariable String id, @RequestBody UpdateRoleRequest request){
        roleService.updateRole(id, request);

        log.info(ControllerLogMessage.Role.ROLE_UPDATE);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable String id){
        roleService.deleteRole(id);

        log.info(ControllerLogMessage.Role.ROLE_DELETE);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDto> findRoleById(@PathVariable String id){
        RoleDto role = roleService.findRoleById(id);

        log.info(ControllerLogMessage.Role.ROLE_FIND);
        return ResponseEntity.ok(role);
    }

    @GetMapping
    public ResponseEntity<List<RoleDto>> findAllRoles(){
        List<RoleDto> roles = roleService.findAllRoles();

        log.info(ControllerLogMessage.Role.ROLE_FIND_ALL);
        return ResponseEntity.ok(roles);
    }
}
