package com.bms.clinicmanagementsystem.exception;

public class StatusAlreadyExistException extends RuntimeException {
    public StatusAlreadyExistException(String message) {
        super(message);
    }
}
