package com.bms.clinicmanagementsystem.request.patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePatientRequest {
    private String firstName;
    private String lastName;
}
