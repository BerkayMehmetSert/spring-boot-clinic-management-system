package com.bms.clinicmanagementsystem.request.clinic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseClinicRequest {
    private String name;

    private String address;

    private String detail;
}
