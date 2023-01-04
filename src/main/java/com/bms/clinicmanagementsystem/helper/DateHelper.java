package com.bms.clinicmanagementsystem.helper;

import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateHelper {
    private DateHelper() {
        throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }
}
