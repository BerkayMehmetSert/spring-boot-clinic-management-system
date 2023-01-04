package com.bms.clinicmanagementsystem.dto;

public record PatientCaseDocumentDto(
        String id,
        String documentInternalId,
        String name,
        String url,
        String detail,
        String documentTypeId,
        String appointmentId,
        String patientId,
        String inDepartmentId
) {
}
