package com.bms.clinicmanagementsystem.exception;

public class DepartmentAlreadyExistException extends RuntimeException {
    public DepartmentAlreadyExistException(String message) {
        super(message);
    }
}
