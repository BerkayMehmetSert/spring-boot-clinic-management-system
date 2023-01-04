package com.bms.clinicmanagementsystem.exception;

public class DocumentTypeAlreadyExistException extends RuntimeException {
    public DocumentTypeAlreadyExistException(String message) {
        super(message);
    }
}
