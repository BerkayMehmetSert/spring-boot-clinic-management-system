package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;

public record PatientPatientCaseDto(
        String id,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Boolean inProgress,
        Double totalCost,
        Double amountPaid
) {
}
