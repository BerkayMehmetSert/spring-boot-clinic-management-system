package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;

public record StatusAppointmentDto(
        String id,
        LocalDateTime startTime,
        LocalDateTime endTime,
        String patientCaseId,
        String inDepartmentId
) {
}
