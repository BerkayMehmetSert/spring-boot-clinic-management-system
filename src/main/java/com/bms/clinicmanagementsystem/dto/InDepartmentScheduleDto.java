package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record InDepartmentScheduleDto(
    String id,
    LocalDate date,
    LocalDateTime startTime,
    LocalDateTime endTime
) {
}
