package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.EmployeeDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.employee.CreateEmployeeRequest;
import com.bms.clinicmanagementsystem.request.employee.UpdateEmployeeRequest;
import com.bms.clinicmanagementsystem.request.employee.UpdateUserEmployeeRequest;
import com.bms.clinicmanagementsystem.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@Slf4j
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<Void> createEmployee(@RequestBody CreateEmployeeRequest request){
        employeeService.createEmployee(request);

        log.info(ControllerLogMessage.Employee.EMPLOYEE_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEmployee(@PathVariable String id,
                                                @RequestBody UpdateEmployeeRequest request){
        employeeService.updateEmployee(id, request);

        log.info(ControllerLogMessage.Employee.EMPLOYEE_UPDATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/username")
    public ResponseEntity<Void> updateEmployeeUsername(@PathVariable String id,
                                                       @RequestBody UpdateUserEmployeeRequest request){
        employeeService.updateUsername(id, request);

        log.info(ControllerLogMessage.Employee.EMPLOYEE_UPDATE);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);

        log.info(ControllerLogMessage.Employee.EMPLOYEE_DELETE);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findEmployeeById(@PathVariable String id){
        EmployeeDto employee = employeeService.findEmployeeById(id);

        log.info(ControllerLogMessage.Employee.EMPLOYEE_FIND);
        return ResponseEntity.ok(employee);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAllEmployees(){
        List<EmployeeDto> employees = employeeService.findAllEmployees();

        log.info(ControllerLogMessage.Employee.EMPLOYEE_FIND_ALL);
        return ResponseEntity.ok(employees);
    }
}
