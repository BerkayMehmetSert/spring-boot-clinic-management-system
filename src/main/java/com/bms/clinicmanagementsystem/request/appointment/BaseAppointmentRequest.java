package com.bms.clinicmanagementsystem.request.appointment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseAppointmentRequest {
    private LocalDateTime startTime;
    private String statusId;
    private String patientCaseId;
    private String inDepartmentId;
}
