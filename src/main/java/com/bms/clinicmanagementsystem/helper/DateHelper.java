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

    public static Integer getDifferenceInHours(LocalDateTime startTime, LocalDateTime endTime) {
        return endTime.getHour() - startTime.getHour();
    }

    public static LocalDate getToday() {
        return LocalDate.now();
    }

    public static LocalDateTime getEndTime(LocalDateTime startTime) {
        return startTime.plusMinutes(30);
    }
}
