package com.bms.clinicmanagementsystem.dto;

public record DocumentTypeDocumentDto(
        String id,
        String documentInternalId,
        String name,
        String url,
        String detail,
        String appointmentId,
        String patientCaseId,
        String patientId,
        String inDepartmentId
) {
}
