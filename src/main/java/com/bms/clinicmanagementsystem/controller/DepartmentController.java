package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.DepartmentDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.department.AddClinicToDepartmentRequest;
import com.bms.clinicmanagementsystem.request.department.CreateDepartmentRequest;
import com.bms.clinicmanagementsystem.request.department.UpdateClinicToDepartmentRequest;
import com.bms.clinicmanagementsystem.request.department.UpdateDepartmentRequest;
import com.bms.clinicmanagementsystem.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
@Slf4j
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<Void> createDepartment(@RequestBody CreateDepartmentRequest request){
        departmentService.createDepartment(request);

        log.info(ControllerLogMessage.Department.DEPARTMENT_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDepartment(@PathVariable String id, @RequestBody UpdateDepartmentRequest request){
        departmentService.updateDepartment(id, request);

        log.info(ControllerLogMessage.Department.DEPARTMENT_UPDATE + id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/clinic")
    public ResponseEntity<Void> addClinicToDepartment(@PathVariable String id, @RequestBody AddClinicToDepartmentRequest request){
        departmentService.addClinicToDepartment(id, request);

        log.info(ControllerLogMessage.Department.DEPARTMENT_ADD_CLINIC);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/clinic/update")
    public ResponseEntity<Void> updateClinicToDepartment(@PathVariable String id,
                                                         @RequestBody UpdateClinicToDepartmentRequest request){
        departmentService.updateClinicInDepartment(id, request);

        log.info(ControllerLogMessage.Department.DEPARTMENT_UPDATE_CLINIC);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable String id){
        departmentService.deleteDepartment(id);

        log.info(ControllerLogMessage.Department.DEPARTMENT_DELETE + id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}/clinic")
    public ResponseEntity<Void> removeClinicFromDepartment(@PathVariable String id){
        departmentService.removeClinicFromDepartment(id);

        log.info(ControllerLogMessage.Department.DEPARTMENT_REMOVE_CLINIC);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDto> findDepartmentById(@PathVariable String id){
        DepartmentDto department = departmentService.findDepartmentById(id);

        log.info(ControllerLogMessage.Department.DEPARTMENT_FIND + id);
        return ResponseEntity.ok(department);
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> findAllDepartments(){
        List<DepartmentDto> departments = departmentService.findAllDepartments();

        log.info(ControllerLogMessage.Department.DEPARTMENT_FIND_ALL);
        return ResponseEntity.ok(departments);
    }
}
