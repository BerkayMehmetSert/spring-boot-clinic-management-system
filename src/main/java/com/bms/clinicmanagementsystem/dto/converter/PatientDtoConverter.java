package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.PatientDto;
import com.bms.clinicmanagementsystem.model.Patient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientDtoConverter {
    private final PatientPatientCaseDtoConverter patientCaseDtoConverter;
    private final PatientDocumentDtoConverter documentDtoConverter;

    public PatientDtoConverter(PatientPatientCaseDtoConverter patientCaseDtoConverter,
                               PatientDocumentDtoConverter documentDtoConverter) {
        this.patientCaseDtoConverter = patientCaseDtoConverter;
        this.documentDtoConverter = documentDtoConverter;
    }

    public PatientDto convert(Patient from) {
        return new PatientDto(
                from.getId(),
                from.getFirstName(),
                from.getLastName(),
                from.getPatientCases() != null ? patientCaseDtoConverter.convert(from.getPatientCases()) : null,
                from.getDocuments() != null ? documentDtoConverter.convert(from.getDocuments()) : null
        );
    }

    public List<PatientDto> convert(List<Patient> from) {
        return from.stream().map(this::convert).toList();
    }
}
