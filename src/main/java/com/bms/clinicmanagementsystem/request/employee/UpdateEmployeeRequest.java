package com.bms.clinicmanagementsystem.request.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRequest extends BaseEmployeeRequest{
    private String firstName;
    private String lastName;
    private String phone;

}
