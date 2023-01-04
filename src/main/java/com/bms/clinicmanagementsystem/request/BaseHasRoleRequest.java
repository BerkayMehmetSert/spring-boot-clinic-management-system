package com.bms.clinicmanagementsystem.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseHasRoleRequest {
    private LocalDateTime timeFrom;
    private LocalDateTime timeTo;
    private String roleId;
    private String employeeId;
}
