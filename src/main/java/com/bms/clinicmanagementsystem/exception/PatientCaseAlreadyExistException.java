package com.bms.clinicmanagementsystem.exception;

public class PatientCaseAlreadyExistException extends RuntimeException {
    public PatientCaseAlreadyExistException(String message) {
        super(message);
    }
}
