package com.bms.clinicmanagementsystem.request.indepartment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseInDepartmentRequest {
    private LocalDateTime timeFrom;

    private LocalDateTime timeTo;
    private String departmentId;
    private String employeeId;
}
