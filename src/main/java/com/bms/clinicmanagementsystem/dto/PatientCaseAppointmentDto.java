package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;

public record PatientCaseAppointmentDto(
        String id,
        LocalDateTime startTime,
        LocalDateTime endTime,
        String statusId,
        String inDepartmentId
) {
}
