package com.bms.clinicmanagementsystem.request.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDocumentRequest {
    private String name;
    private String detail;
    private String documentTypeId;
    private String appointmentId;
    private String patientCaseId;
    private String patientId;
    private String inDepartmentId;
}
