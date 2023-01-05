package com.bms.clinicmanagementsystem.request.patientcase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePatientCaseRequest {
    private Double amountPaid;
    private String patientId;
}
