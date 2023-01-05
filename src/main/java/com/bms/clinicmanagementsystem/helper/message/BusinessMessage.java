package com.bms.clinicmanagementsystem.helper.message;

public class BusinessMessage {
    public static final String ILLEGAL_STATE_EXCEPTION = "Utility class, cannot be instantiated";
    private BusinessMessage(){
        throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
    }

    public static class Appointment{
        private Appointment(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String APPOINTMENT_NOT_FOUND = "Appointment not found";
        public static final String APPOINTMENT_LIST_EMPTY = "Appointment list is empty";
    }

    public static class Clinic{
        private Clinic(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CLINIC_NOT_FOUND = "Clinic not found";
        public static final String CLINIC_LIST_EMPTY = "Clinic list is empty";
        public static final String CLINIC_ALREADY_EXISTS = "Clinic already exists";
    }

    public static class Department{
        private Department(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DEPARTMENT_NOT_FOUND = "Department not found";
        public static final String DEPARTMENT_LIST_EMPTY = "Department list is empty";
        public static final String DEPARTMENT_ALREADY_EXISTS = "Department already exists";
    }

    public static class Document{
        private Document(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DOCUMENT_NOT_FOUND = "Document not found";
        public static final String DOCUMENT_LIST_EMPTY = "Document list is empty";
    }

    public static class DocumentType{
        private DocumentType(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DOCUMENT_TYPE_NOT_FOUND = "Document type not found";
        public static final String DOCUMENT_TYPE_LIST_EMPTY = "Document type list is empty";
        public static final String DOCUMENT_TYPE_ALREADY_EXISTS = "Document type already exists";
    }

    public static class Employee{
        private Employee(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String EMPLOYEE_NOT_FOUND = "Employee not found";
        public static final String EMPLOYEE_LIST_EMPTY = "Employee list is empty";
        public static final String EMPLOYEE_ALREADY_EXISTS = "Employee already exists";
    }

    public static class HasRole{
        private HasRole(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String HAS_ROLE_NOT_FOUND = "Has role not found";
        public static final String HAS_ROLE_LIST_EMPTY = "Has role list is empty";
    }

    public static class InDepartment{
        private InDepartment(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String IN_DEPARTMENT_NOT_FOUND = "In department not found";
        public static final String IN_DEPARTMENT_LIST_EMPTY = "In department list is empty";
    }

    public static class Patient{
        private Patient(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PATIENT_NOT_FOUND = "Patient not found";
        public static final String PATIENT_LIST_EMPTY = "Patient list is empty";
        public static final String PATIENT_ALREADY_EXISTS = "Patient already exists";
    }

    public static class PatientCase{
        private PatientCase(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PATIENT_CASE_NOT_FOUND = "Patient case not found";
        public static final String PATIENT_CASE_LIST_EMPTY = "Patient case list is empty";
    }
    public static class Role{
        private Role(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROLE_NOT_FOUND = "Role not found";
        public static final String ROLE_LIST_EMPTY = "Role list is empty";
        public static final String ROLE_ALREADY_EXISTS = "Role already exists";
    }

    public static class Schedule{

        private Schedule(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }
        public static final String SCHEDULE_DATE_IS_BEFORE_TODAY = "Schedule date is before today";

        public static final String SCHEDULE_NOT_FOUND = "Schedule not found";
        public static final String SCHEDULE_LIST_EMPTY = "Schedule list is empty";
    }

    public static class Status{
        private Status(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATUS_NOT_FOUND = "Status not found";
        public static final String STATUS_LIST_EMPTY = "Status list is empty";
        public static final String STATUS_ALREADY_EXISTS = "Status already exists";
    }

    public static class StatusHistory{
        private StatusHistory(){
            throw new IllegalStateException(ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATUS_HISTORY_NOT_FOUND = "Status history not found";
        public static final String STATUS_HISTORY_LIST_EMPTY = "Status history list is empty";
    }
}
