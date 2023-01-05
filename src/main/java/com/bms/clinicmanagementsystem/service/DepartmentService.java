package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.dto.DepartmentDto;
import com.bms.clinicmanagementsystem.dto.converter.DepartmentDtoConverter;
import com.bms.clinicmanagementsystem.exception.DepartmentAlreadyExistException;
import com.bms.clinicmanagementsystem.exception.DepartmentNotFoundException;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;
import com.bms.clinicmanagementsystem.model.Department;
import com.bms.clinicmanagementsystem.repository.DepartmentRepository;
import com.bms.clinicmanagementsystem.request.department.AddClinicToDepartmentRequest;
import com.bms.clinicmanagementsystem.request.department.CreateDepartmentRequest;
import com.bms.clinicmanagementsystem.request.department.UpdateClinicToDepartmentRequest;
import com.bms.clinicmanagementsystem.request.department.UpdateDepartmentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final ClinicService clinicService;
    private final DepartmentDtoConverter converter;

    public DepartmentService(DepartmentRepository departmentRepository,
                             ClinicService clinicService,
                             DepartmentDtoConverter converter) {
        this.departmentRepository = departmentRepository;
        this.clinicService = clinicService;
        this.converter = converter;
    }

    public void createDepartment(final CreateDepartmentRequest request) {
        Department department = new Department();

        checkIfDepartmentExists(request.getName());

        department.setName(request.getName());

        departmentRepository.save(department);
        log.info(BusinessLogMessage.Department.DEPARTMENT_CREATED);
    }

    public void updateDepartment(final String id, final UpdateDepartmentRequest request) {
        Department department = findDepartmentByDepartmentId(id);

        if (!department.getName().equals(request.getName())) {
            checkIfDepartmentExists(request.getName());
        }

        department.setName(request.getName());

        departmentRepository.save(department);
        log.info(BusinessLogMessage.Department.DEPARTMENT_UPDATED + id);
    }

    public void addClinicToDepartment(final String departmentId,
                                      final AddClinicToDepartmentRequest request) {
        Department department = findDepartmentByDepartmentId(departmentId);

        department.setClinic(clinicService.findClinicByClinicId(request.getClinicId()));

        departmentRepository.save(department);
        log.info(BusinessLogMessage.Department.CLINIC_ADDED_TO_DEPARTMENT + departmentId);
    }

    public void updateClinicInDepartment(final String departmentId,
                                         final UpdateClinicToDepartmentRequest request) {
        Department department = findDepartmentByDepartmentId(departmentId);

        department.setClinic(clinicService.findClinicByClinicId(request.getClinicId()));

        departmentRepository.save(department);
        log.info(BusinessLogMessage.Department.CLINIC_UPDATED_IN_DEPARTMENT + departmentId);
    }

    public void deleteDepartment(final String id) {
        departmentRepository.delete(findDepartmentByDepartmentId(id));
        log.info(BusinessLogMessage.Department.DEPARTMENT_DELETED + id);
    }

    public void removeClinicFromDepartment(final String departmentId) {
        Department department = findDepartmentByDepartmentId(departmentId);

        department.setClinic(null);

        departmentRepository.save(department);
        log.info(BusinessLogMessage.Department.CLINIC_DELETED_FROM_DEPARTMENT + departmentId);
    }

    public DepartmentDto findDepartmentById(final String id) {
        Department department = findDepartmentByDepartmentId(id);

        log.info(BusinessLogMessage.Department.DEPARTMENT_FOUND + id);
        return converter.convert(department);
    }

    public List<DepartmentDto> findAllDepartments() {
        List<Department> departments = departmentRepository.findAll();

        if (departments.isEmpty()) {
            log.info(BusinessLogMessage.Department.DEPARTMENT_LIST_EMPTY);
            throw new DepartmentNotFoundException(BusinessMessage.Department.DEPARTMENT_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.Department.DEPARTMENT_LIST_FOUND);
        return converter.convert(departments);
    }

    protected Department findDepartmentByDepartmentId(final String id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> {
                    log.error(BusinessLogMessage.Department.DEPARTMENT_NOT_FOUND + id);
                    throw new DepartmentNotFoundException(BusinessMessage.Department.DEPARTMENT_NOT_FOUND);
                });
    }

    private void checkIfDepartmentExists(final String name) {
        if (departmentRepository.existsByNameIgnoreCase(name)) {
            log.error(BusinessLogMessage.Department.DEPARTMENT_ALREADY_EXISTS + name);
            throw new DepartmentAlreadyExistException(BusinessMessage.Department.DEPARTMENT_ALREADY_EXISTS);
        }
    }
}
