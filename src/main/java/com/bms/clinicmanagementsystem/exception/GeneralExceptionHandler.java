package com.bms.clinicmanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GeneralExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AppointmentAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleAppointmentAlreadyExistException(AppointmentAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(AppointmentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleAppointmentNotFoundException(AppointmentNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(ClinicAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleClinicAlreadyExistException(ClinicAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(ClinicNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleClinicNotFoundException(ClinicNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(DepartmentAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleDepartmentAlreadyExistException(DepartmentAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(DepartmentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleDepartmentNotFoundException(DepartmentNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(DocumentAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleDocumentAlreadyExistException(DocumentAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(DocumentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleDocumentNotFoundException(DocumentNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(DocumentTypeAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleDocumentTypeAlreadyExistException(DocumentTypeAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(DocumentTypeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleDocumentTypeNotFoundException(DocumentTypeNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(EmployeeAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleEmployeeAlreadyExistException(EmployeeAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(HasRoleAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleHasRoleAlreadyExistException(HasRoleAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(HasRoleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleHasRoleNotFoundException(HasRoleNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(InDepartmentAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleInDepartmentAlreadyExistException(InDepartmentAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(InDepartmentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleInDepartmentNotFoundException(InDepartmentNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(PatientAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handlePatientAlreadyExistException(PatientAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(PatientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handlePatientNotFoundException(PatientNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(PatientCaseAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handlePatientCaseAlreadyExistException(PatientCaseAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(PatientCaseNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handlePatientCaseNotFoundException(PatientCaseNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(RoleAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleRoleAlreadyExistException(RoleAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(RoleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleRoleNotFoundException(RoleNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(ScheduleAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleScheduleAlreadyExistException(ScheduleAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(ScheduleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleScheduleNotFoundException(ScheduleNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(StatusAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleStatusAlreadyExistException(StatusAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(StatusNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleStatusNotFoundException(StatusNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(StatusHistoryAlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<Object> handleStatusHistoryAlreadyExistException(StatusHistoryAlreadyExistException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }

    @ExceptionHandler(StatusHistoryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> handleStatusHistoryNotFoundException(StatusHistoryNotFoundException ex) {
        return ResponseEntity.ok(ex.getMessage());
    }
}
