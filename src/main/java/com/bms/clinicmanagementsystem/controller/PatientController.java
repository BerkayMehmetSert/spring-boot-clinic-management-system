package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.PatientDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.patient.CreatePatientRequest;
import com.bms.clinicmanagementsystem.request.patient.UpdatePatientRequest;
import com.bms.clinicmanagementsystem.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
@Slf4j
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<Void> createPatient(@RequestBody CreatePatientRequest request) {
        patientService.createPatient(request);

        log.info(ControllerLogMessage.Patient.PATIENT_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePatient(@PathVariable String id, @RequestBody UpdatePatientRequest request) {
        patientService.updatePatient(id, request);

        log.info(ControllerLogMessage.Patient.PATIENT_UPDATE + id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable String id) {
        patientService.deletePatient(id);

        log.info(ControllerLogMessage.Patient.PATIENT_DELETE + id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientDto> findPatientById(@PathVariable String id) {
        PatientDto patient = patientService.findPatientById(id);

        log.info(ControllerLogMessage.Patient.PATIENT_FIND + id);
        return ResponseEntity.ok(patient);
    }

    @GetMapping
    public ResponseEntity<List<PatientDto>> findAllPatients() {
        List<PatientDto> patients = patientService.findAllPatients();

        log.info(ControllerLogMessage.Patient.PATIENT_FIND_ALL);
        return ResponseEntity.ok(patients);
    }
}
