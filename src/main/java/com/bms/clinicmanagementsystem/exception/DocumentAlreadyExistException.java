package com.bms.clinicmanagementsystem.exception;

public class DocumentAlreadyExistException extends RuntimeException {
    public DocumentAlreadyExistException(String message) {
        super(message);
    }
}
