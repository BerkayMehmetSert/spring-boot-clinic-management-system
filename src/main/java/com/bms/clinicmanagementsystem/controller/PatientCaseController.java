package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.PatientCaseDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.patientcase.CreatePatientCaseRequest;
import com.bms.clinicmanagementsystem.request.patientcase.UpdatePatientCaseRequest;
import com.bms.clinicmanagementsystem.service.PatientCaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.util.List;

@RestController
@RequestMapping("/api/v1/patientCases")
@Slf4j
public class PatientCaseController {
    private final PatientCaseService patientCaseService;

    public PatientCaseController(PatientCaseService patientCaseService) {
        this.patientCaseService = patientCaseService;
    }

    @PostMapping
    public ResponseEntity<Void> createPatientCase(@RequestBody CreatePatientCaseRequest request) {
        patientCaseService.createPatientCase(request);

        log.info(ControllerLogMessage.PatientCase.PATIENT_CASE_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePatientCase(@PathVariable String id,
                                                  @RequestBody UpdatePatientCaseRequest request) {
        patientCaseService.updatePatientCase(id, request);

        log.info(ControllerLogMessage.PatientCase.PATIENT_CASE_UPDATE + id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Void> completePatientCase(@PathVariable String id) {
        patientCaseService.completePatientCase(id);

        log.info(ControllerLogMessage.PatientCase.PATIENT_CASE_COMPLETE);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/pdf")
    public ResponseEntity<InputStreamResource> generatePdf(@PathVariable String id) {
        ByteArrayInputStream pdf = patientCaseService.createPatientCaseDocument(id);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=" + id + ".pdf");

        log.info(ControllerLogMessage.PatientCase.PATIENT_CASE_PDF);
        return ResponseEntity.ok().headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdf));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientCaseDto> findPatientCaseById(@PathVariable String id) {
        PatientCaseDto patientCase = patientCaseService.findPatientCaseById(id);

        log.info(ControllerLogMessage.PatientCase.PATIENT_CASE_FIND + id);
        return ResponseEntity.ok(patientCase);
    }

    @GetMapping
    public ResponseEntity<List<PatientCaseDto>> findAllPatientCases() {
        List<PatientCaseDto> patientCases = patientCaseService.findAllPatientCases();

        log.info(ControllerLogMessage.PatientCase.PATIENT_CASE_FIND_ALL);
        return ResponseEntity.ok(patientCases);
    }
}
