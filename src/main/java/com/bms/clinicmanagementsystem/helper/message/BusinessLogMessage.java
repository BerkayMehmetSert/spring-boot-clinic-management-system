package com.bms.clinicmanagementsystem.helper.message;

public class BusinessLogMessage {
    private BusinessLogMessage() {
        throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
    }

    public static class Appointment {
        private Appointment() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String APPOINTMENT_CREATED = "Appointment created successfully";
        public static final String APPOINTMENT_UPDATED = "Appointment updated successfully : {}";
        public static final String APPOINTMENT_DELETED = "Appointment deleted successfully : {}";
        public static final String APPOINTMENT_FOUND = "Appointment found successfully : {}";
        public static final String APPOINTMENT_LIST_FOUND = "Appointment list found successfully";
        public static final String APPOINTMENT_NOT_FOUND = "Appointment not found : {}";
        public static final String APPOINTMENT_LIST_EMPTY = "Appointment list is empty";
        public static final String APPOINTMENT_ALREADY_EXISTS = "Appointment already exists : {}";
    }

    public static class Clinic{
        private Clinic() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String CLINIC_CREATED = "Clinic created successfully";
        public static final String CLINIC_UPDATED = "Clinic updated successfully : {}";
        public static final String CLINIC_DELETED = "Clinic deleted successfully : {}";
        public static final String CLINIC_FOUND = "Clinic found successfully : {}";
        public static final String CLINIC_LIST_FOUND = "Clinic list found successfully";
        public static final String CLINIC_NOT_FOUND = "Clinic not found : {}";
        public static final String CLINIC_LIST_EMPTY = "Clinic list is empty";
        public static final String CLINIC_ALREADY_EXISTS = "Clinic already exists : {}";
    }

    public static class Department{
        private Department() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DEPARTMENT_CREATED = "Department created successfully";
        public static final String DEPARTMENT_UPDATED = "Department updated successfully : {}";
        public static final String DEPARTMENT_DELETED = "Department deleted successfully : {}";
        public static final String DEPARTMENT_FOUND = "Department found successfully : {}";
        public static final String DEPARTMENT_LIST_FOUND = "Department list found successfully";
        public static final String DEPARTMENT_NOT_FOUND = "Department not found : {}";
        public static final String DEPARTMENT_LIST_EMPTY = "Department list is empty";
        public static final String DEPARTMENT_ALREADY_EXISTS = "Department already exists : {}";
    }

    public static class Document{
        private Document() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DOCUMENT_CREATED = "Document created successfully";
        public static final String DOCUMENT_UPDATED = "Document updated successfully : {}";
        public static final String DOCUMENT_DELETED = "Document deleted successfully : {}";
        public static final String DOCUMENT_FOUND = "Document found successfully : {}";
        public static final String DOCUMENT_LIST_FOUND = "Document list found successfully";
        public static final String DOCUMENT_NOT_FOUND = "Document not found : {}";
        public static final String DOCUMENT_LIST_EMPTY = "Document list is empty";
        public static final String DOCUMENT_ALREADY_EXISTS = "Document already exists : {}";
    }

    public static class DocumentType{
        private DocumentType() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String DOCUMENT_TYPE_CREATED = "Document type created successfully";
        public static final String DOCUMENT_TYPE_UPDATED = "Document type updated successfully : {}";
        public static final String DOCUMENT_TYPE_DELETED = "Document type deleted successfully : {}";
        public static final String DOCUMENT_TYPE_FOUND = "Document type found successfully : {}";
        public static final String DOCUMENT_TYPE_LIST_FOUND = "Document type list found successfully";
        public static final String DOCUMENT_TYPE_NOT_FOUND = "Document type not found : {}";
        public static final String DOCUMENT_TYPE_LIST_EMPTY = "Document type list is empty";
        public static final String DOCUMENT_TYPE_ALREADY_EXISTS = "Document type already exists : {}";
    }

    public static class Employee{
        private Employee() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String EMPLOYEE_CREATED = "Employee created successfully";
        public static final String EMPLOYEE_UPDATED = "Employee updated successfully : {}";
        public static final String EMPLOYEE_DELETED = "Employee deleted successfully : {}";
        public static final String EMPLOYEE_FOUND = "Employee found successfully : {}";
        public static final String EMPLOYEE_LIST_FOUND = "Employee list found successfully";
        public static final String EMPLOYEE_NOT_FOUND = "Employee not found : {}";
        public static final String EMPLOYEE_LIST_EMPTY = "Employee list is empty";
        public static final String EMPLOYEE_ALREADY_EXISTS = "Employee already exists : {}";
    }

    public static class HasRole{
        private HasRole() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String HAS_ROLE_CREATED = "Has role created successfully";
        public static final String HAS_ROLE_UPDATED = "Has role updated successfully : {}";
        public static final String HAS_ROLE_DELETED = "Has role deleted successfully : {}";
        public static final String HAS_ROLE_FOUND = "Has role found successfully : {}";
        public static final String HAS_ROLE_LIST_FOUND = "Has role list found successfully";
        public static final String HAS_ROLE_NOT_FOUND = "Has role not found : {}";
        public static final String HAS_ROLE_LIST_EMPTY = "Has role list is empty";
        public static final String HAS_ROLE_ALREADY_EXISTS = "Has role already exists : {}";
    }

    public static class InDepartment{
        private InDepartment() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String IN_DEPARTMENT_CREATED = "In department created successfully";
        public static final String IN_DEPARTMENT_UPDATED = "In department updated successfully : {}";
        public static final String IN_DEPARTMENT_DELETED = "In department deleted successfully : {}";
        public static final String IN_DEPARTMENT_FOUND = "In department found successfully : {}";
        public static final String IN_DEPARTMENT_LIST_FOUND = "In department list found successfully";
        public static final String IN_DEPARTMENT_NOT_FOUND = "In department not found : {}";
        public static final String IN_DEPARTMENT_LIST_EMPTY = "In department list is empty";
        public static final String IN_DEPARTMENT_ALREADY_EXISTS = "In department already exists : {}";
    }

    public static class Patient{
        private Patient() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PATIENT_CREATED = "Patient created successfully";
        public static final String PATIENT_UPDATED = "Patient updated successfully : {}";
        public static final String PATIENT_DELETED = "Patient deleted successfully : {}";
        public static final String PATIENT_FOUND = "Patient found successfully : {}";
        public static final String PATIENT_LIST_FOUND = "Patient list found successfully";
        public static final String PATIENT_NOT_FOUND = "Patient not found : {}";
        public static final String PATIENT_LIST_EMPTY = "Patient list is empty";
        public static final String PATIENT_ALREADY_EXISTS = "Patient already exists : {}";
    }

    public static class PatientCase{
        private PatientCase() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String PATIENT_CASE_CREATED = "Patient case created successfully";
        public static final String PATIENT_CASE_UPDATED = "Patient case updated successfully : {}";
        public static final String PATIENT_CASE_DELETED = "Patient case deleted successfully : {}";
        public static final String PATIENT_CASE_FOUND = "Patient case found successfully : {}";
        public static final String PATIENT_CASE_LIST_FOUND = "Patient case list found successfully";
        public static final String PATIENT_CASE_NOT_FOUND = "Patient case not found : {}";
        public static final String PATIENT_CASE_LIST_EMPTY = "Patient case list is empty";
        public static final String PATIENT_CASE_ALREADY_EXISTS = "Patient case already exists : {}";
    }

    public static class Role{
        private Role() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String ROLE_CREATED = "Role created successfully";
        public static final String ROLE_UPDATED = "Role updated successfully : {}";
        public static final String ROLE_DELETED = "Role deleted successfully : {}";
        public static final String ROLE_FOUND = "Role found successfully : {}";
        public static final String ROLE_LIST_FOUND = "Role list found successfully";
        public static final String ROLE_NOT_FOUND = "Role not found : {}";
        public static final String ROLE_LIST_EMPTY = "Role list is empty";
        public static final String ROLE_ALREADY_EXISTS = "Role already exists : {}";
    }

    public static class Schedule{
        private Schedule() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String SCHEDULE_CREATED = "Schedule created successfully";
        public static final String SCHEDULE_UPDATED = "Schedule updated successfully : {}";
        public static final String SCHEDULE_DELETED = "Schedule deleted successfully : {}";
        public static final String SCHEDULE_FOUND = "Schedule found successfully : {}";
        public static final String SCHEDULE_LIST_FOUND = "Schedule list found successfully";
        public static final String SCHEDULE_NOT_FOUND = "Schedule not found : {}";
        public static final String SCHEDULE_LIST_EMPTY = "Schedule list is empty";
        public static final String SCHEDULE_ALREADY_EXISTS = "Schedule already exists : {}";
    }

    public static class Status{
        private Status() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATUS_CREATED = "Status created successfully";
        public static final String STATUS_UPDATED = "Status updated successfully : {}";
        public static final String STATUS_DELETED = "Status deleted successfully : {}";
        public static final String STATUS_FOUND = "Status found successfully : {}";
        public static final String STATUS_LIST_FOUND = "Status list found successfully";
        public static final String STATUS_NOT_FOUND = "Status not found : {}";
        public static final String STATUS_LIST_EMPTY = "Status list is empty";
        public static final String STATUS_ALREADY_EXISTS = "Status already exists : {}";
    }

    public static class StatusHistory{
        private StatusHistory() {
            throw new IllegalStateException(BusinessMessage.ILLEGAL_STATE_EXCEPTION);
        }

        public static final String STATUS_HISTORY_CREATED = "Status history created successfully";
        public static final String STATUS_HISTORY_UPDATED = "Status history updated successfully : {}";
        public static final String STATUS_HISTORY_DELETED = "Status history deleted successfully : {}";
        public static final String STATUS_HISTORY_FOUND = "Status history found successfully : {}";
        public static final String STATUS_HISTORY_LIST_FOUND = "Status history list found successfully";
        public static final String STATUS_HISTORY_NOT_FOUND = "Status history not found : {}";
        public static final String STATUS_HISTORY_LIST_EMPTY = "Status history list is empty";
        public static final String STATUS_HISTORY_ALREADY_EXISTS = "Status history already exists : {}";
    }
}
