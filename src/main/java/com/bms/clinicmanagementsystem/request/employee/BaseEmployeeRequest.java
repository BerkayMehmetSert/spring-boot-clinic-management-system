package com.bms.clinicmanagementsystem.request.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEmployeeRequest {
    private String username;
    private String password;
    private String email;

}
