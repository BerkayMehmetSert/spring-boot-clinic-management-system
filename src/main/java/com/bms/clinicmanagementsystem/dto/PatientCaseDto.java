package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;
import java.util.List;

public record PatientCaseDto(
        String id,
        LocalDateTime startTime,
        LocalDateTime endTime,
        Boolean inProgress,
        Double totalCost,
        Double amountPaid,
        List<PatientCaseAppointmentDto> appointments,
        List<PatientCaseDocumentDto> documents
) {
}
