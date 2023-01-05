package com.bms.clinicmanagementsystem.request.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseScheduleRequest {
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String inDepartmentId;
}
