package com.bms.clinicmanagementsystem.helper.message;

public class ControllerLogMessage {
    private ControllerLogMessage() {
        throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
    }

    public static class Appointment {
        private Appointment() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String APPOINTMENT_CREATE = "Appointment API: Create Appointment";
        public static final String APPOINTMENT_UPDATE = "Appointment API: Update Appointment";
        public static final String APPOINTMENT_DELETE = "Appointment API: Delete Appointment";
        public static final String APPOINTMENT_FIND = "Appointment API: Find Appointment";
        public static final String APPOINTMENT_FIND_ALL = "Appointment API: Find All Appointment";
    }

    public static class Clinic {
        private Clinic() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CLINIC_CREATE = "Clinic API: Create Clinic";
        public static final String CLINIC_UPDATE = "Clinic API: Update Clinic";
        public static final String CLINIC_DELETE = "Clinic API: Delete Clinic";
        public static final String CLINIC_FIND = "Clinic API: Find Clinic";
        public static final String CLINIC_FIND_ALL = "Clinic API: Find All Clinic";
    }

    public static class Department {
        private Department() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DEPARTMENT_CREATE = "Department API: Create Department";
        public static final String DEPARTMENT_UPDATE = "Department API: Update Department";
        public static final String DEPARTMENT_DELETE = "Department API: Delete Department";
        public static final String DEPARTMENT_FIND = "Department API: Find Department";
        public static final String DEPARTMENT_FIND_ALL = "Department API: Find All Department";
        public static final String DEPARTMENT_ADD_CLINIC = "Department API: Add Clinic to Department";
        public static final String DEPARTMENT_REMOVE_CLINIC = "Department API: Remove Clinic from Department";
        public static final String DEPARTMENT_UPDATE_CLINIC = "Department API: Update Clinic in Department";
    }

    public static class Document {
        private Document() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DOCUMENT_PDF_CREATE = "Document API: Create PDF Document";
        public static final String DOCUMENT_CREATE = "Document API: Create Document";
        public static final String DOCUMENT_UPDATE = "Document API: Update Document";
        public static final String DOCUMENT_DELETE = "Document API: Delete Document";
        public static final String DOCUMENT_FIND = "Document API: Find Document";
        public static final String DOCUMENT_FIND_ALL = "Document API: Find All Document";
    }

    public static class DocumentType {
        private DocumentType() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DOCUMENT_TYPE_CREATE = "DocumentType API: Create DocumentType";
        public static final String DOCUMENT_TYPE_UPDATE = "DocumentType API: Update DocumentType";
        public static final String DOCUMENT_TYPE_DELETE = "DocumentType API: Delete DocumentType";
        public static final String DOCUMENT_TYPE_FIND = "DocumentType API: Find DocumentType";
        public static final String DOCUMENT_TYPE_FIND_ALL = "DocumentType API: Find All DocumentType";
    }

    public static class Employee {
        private Employee() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String EMPLOYEE_CREATE = "Employee API: Create Employee";
        public static final String EMPLOYEE_UPDATE = "Employee API: Update Employee";
        public static final String EMPLOYEE_DELETE = "Employee API: Delete Employee";
        public static final String EMPLOYEE_FIND = "Employee API: Find Employee";
        public static final String EMPLOYEE_FIND_ALL = "Employee API: Find All Employee";
    }

    public static class HasRole {
        private HasRole() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String HAS_ROLE_CREATE = "HasRole API: Create HasRole";
        public static final String HAS_ROLE_UPDATE = "HasRole API: Update HasRole";
        public static final String HAS_ROLE_DELETE = "HasRole API: Delete HasRole";
        public static final String HAS_ROLE_FIND = "HasRole API: Find HasRole";
        public static final String HAS_ROLE_FIND_ALL = "HasRole API: Find All HasRole";
    }

    public static class InDepartment {
        private InDepartment() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String IN_DEPARTMENT_CREATE = "InDepartment API: Create InDepartment";
        public static final String IN_DEPARTMENT_UPDATE = "InDepartment API: Update InDepartment";
        public static final String IN_DEPARTMENT_DELETE = "InDepartment API: Delete InDepartment";
        public static final String IN_DEPARTMENT_FIND = "InDepartment API: Find InDepartment";
        public static final String IN_DEPARTMENT_FIND_ALL = "InDepartment API: Find All InDepartment";
    }

    public static class Patient {
        private Patient() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PATIENT_CREATE = "Patient API: Create Patient";
        public static final String PATIENT_UPDATE = "Patient API: Update Patient";
        public static final String PATIENT_DELETE = "Patient API: Delete Patient";
        public static final String PATIENT_FIND = "Patient API: Find Patient";
        public static final String PATIENT_FIND_ALL = "Patient API: Find All Patient";
    }

    public static class PatientCase {
        private PatientCase() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PATIENT_CASE_CREATE = "PatientCase API: Create PatientCase";
        public static final String PATIENT_CASE_UPDATE = "PatientCase API: Update PatientCase";
        public static final String PATIENT_CASE_FIND = "PatientCase API: Find PatientCase";
        public static final String PATIENT_CASE_FIND_ALL = "PatientCase API: Find All PatientCase";
        public static final String PATIENT_CASE_COMPLETE = "PatientCase API: Complete PatientCase";
        public static final String PATIENT_CASE_PDF = "PatientCase API: Generate PDF for PatientCase";
    }

    public static class Role {
        private Role() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROLE_CREATE = "Role API: Create Role";
        public static final String ROLE_UPDATE = "Role API: Update Role";
        public static final String ROLE_DELETE = "Role API: Delete Role";
        public static final String ROLE_FIND = "Role API: Find Role";
        public static final String ROLE_FIND_ALL = "Role API: Find All Role";
    }

    public static class Schedule {
        private Schedule() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String SCHEDULE_CREATE = "Schedule API: Create Schedule";
        public static final String SCHEDULE_UPDATE = "Schedule API: Update Schedule";
        public static final String SCHEDULE_DELETE = "Schedule API: Delete Schedule";
        public static final String SCHEDULE_FIND = "Schedule API: Find Schedule";
        public static final String SCHEDULE_FIND_ALL = "Schedule API: Find All Schedule";
    }

    public static class Status {
        private Status() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATUS_CREATE = "Status API: Create Status";
        public static final String STATUS_UPDATE = "Status API: Update Status";
        public static final String STATUS_DELETE = "Status API: Delete Status";
        public static final String STATUS_FIND = "Status API: Find Status";
        public static final String STATUS_FIND_ALL = "Status API: Find All Status";
    }

    public static class StatusHistory {
        private StatusHistory() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATUS_HISTORY_CREATE = "StatusHistory API: Create StatusHistory";
        public static final String STATUS_HISTORY_UPDATE = "StatusHistory API: Update StatusHistory";
        public static final String STATUS_HISTORY_DELETE = "StatusHistory API: Delete StatusHistory";
        public static final String STATUS_HISTORY_FIND = "StatusHistory API: Find StatusHistory";
        public static final String STATUS_HISTORY_FIND_ALL = "StatusHistory API: Find All StatusHistory";
    }
}
