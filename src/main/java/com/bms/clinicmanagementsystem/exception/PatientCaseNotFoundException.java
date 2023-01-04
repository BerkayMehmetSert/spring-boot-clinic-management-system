package com.bms.clinicmanagementsystem.exception;

public class PatientCaseNotFoundException extends RuntimeException {
    public PatientCaseNotFoundException(String message) {
        super(message);
    }
}
