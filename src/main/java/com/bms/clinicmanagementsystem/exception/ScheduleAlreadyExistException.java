package com.bms.clinicmanagementsystem.exception;

public class ScheduleAlreadyExistException extends RuntimeException {
    public ScheduleAlreadyExistException(String message) {
        super(message);
    }
}
