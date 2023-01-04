package com.bms.clinicmanagementsystem.exception;

public class AppointmentAlreadyExistException extends RuntimeException {
    public AppointmentAlreadyExistException(String message) {
        super(message);
    }
}
