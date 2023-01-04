package com.bms.clinicmanagementsystem.dto;

public record DocumentDto(
    String id,
    String documentInternalId,
    String name,
    String url,
    String detail,
    String documentTypeId,
    String appointmentId,
    String patientCaseId,
    String patientId,
    String inDepartmentId
) {
}
