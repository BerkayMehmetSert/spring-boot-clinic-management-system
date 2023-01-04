package com.bms.clinicmanagementsystem.exception;

public class PatientAlreadyExistException extends RuntimeException {
    public PatientAlreadyExistException(String message) {
        super(message);
    }
}
