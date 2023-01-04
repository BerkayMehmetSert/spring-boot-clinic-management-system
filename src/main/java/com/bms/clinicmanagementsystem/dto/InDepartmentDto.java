package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;
import java.util.List;

public record InDepartmentDto(
    String id,
    LocalDateTime timeFrom,
    LocalDateTime timeTo,
    Boolean isActive,
    String departmentId,
    String employeeId,
    List<InDepartmentScheduleDto> schedules,
    List<InDepartmentAppointmentDto> appointments,
    List<InDepartmentDocumentDto> documents
) {
}
