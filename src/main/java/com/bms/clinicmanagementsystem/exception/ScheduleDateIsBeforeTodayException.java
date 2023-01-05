package com.bms.clinicmanagementsystem.exception;

public class ScheduleDateIsBeforeTodayException extends RuntimeException {
    public ScheduleDateIsBeforeTodayException(String message) {
        super(message);
    }
}
