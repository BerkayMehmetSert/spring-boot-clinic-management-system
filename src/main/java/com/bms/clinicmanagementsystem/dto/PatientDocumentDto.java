package com.bms.clinicmanagementsystem.dto;

public record PatientDocumentDto(
        String id,
        String documentInternalId,
        String name,
        String url,
        String detail,
        String documentTypeId,
        String appointmentId,
        String patientCaseId,
        String inDepartmentId
) {
}
