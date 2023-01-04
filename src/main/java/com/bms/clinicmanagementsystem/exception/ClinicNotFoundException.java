package com.bms.clinicmanagementsystem.exception;

public class ClinicNotFoundException extends RuntimeException {
    public ClinicNotFoundException(String message) {
        super(message);
    }
}
