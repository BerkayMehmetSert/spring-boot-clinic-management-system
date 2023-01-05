package com.bms.clinicmanagementsystem.request.satushistory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseStatusHistoryRequest {
    private String description;
    private String statusId;
    private String appointmentId;
}
