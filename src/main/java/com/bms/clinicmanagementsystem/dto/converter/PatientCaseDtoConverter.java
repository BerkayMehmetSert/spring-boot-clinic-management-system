package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.PatientCaseDto;
import com.bms.clinicmanagementsystem.model.PatientCase;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientCaseDtoConverter {
    private final PatientCaseAppointmentDtoConverter patientCaseAppointmentDtoConverter;
    private final PatientCaseDocumentDtoConverter patientCaseDocumentDtoConverter;

    public PatientCaseDtoConverter(PatientCaseAppointmentDtoConverter patientCaseAppointmentDtoConverter,
                                   PatientCaseDocumentDtoConverter patientCaseDocumentDtoConverter) {
        this.patientCaseAppointmentDtoConverter = patientCaseAppointmentDtoConverter;
        this.patientCaseDocumentDtoConverter = patientCaseDocumentDtoConverter;
    }

    public PatientCaseDto convert(PatientCase from) {
        return new PatientCaseDto(
                from.getId(),
                from.getStartTime(),
                from.getEndTime(),
                from.getInProgress(),
                from.getTotalCost(),
                from.getAmountPaid(),
                from.getAppointments() != null ? patientCaseAppointmentDtoConverter.convert(from.getAppointments()) : null,
                from.getDocuments() != null ? patientCaseDocumentDtoConverter.convert(from.getDocuments()) : null
        );
    }

    public List<PatientCaseDto> convert(List<PatientCase> from) {
        return from.stream().map(this::convert).toList();
    }
}
