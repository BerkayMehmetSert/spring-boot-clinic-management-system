package com.bms.clinicmanagementsystem.exception;

public class EmployeeAlreadyExistException extends RuntimeException {
    public EmployeeAlreadyExistException(String message) {
        super(message);
    }
}
