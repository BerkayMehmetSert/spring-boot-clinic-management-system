package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.DocumentDto;
import com.bms.clinicmanagementsystem.model.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentDtoConverter {
    public DocumentDto convert(Document from) {
        return new DocumentDto(
                from.getId(),
                from.getDocumentInternalId(),
                from.getName(),
                from.getUrl(),
                from.getDetail(),
                from.getDocumentType() == null ? null : from.getDocumentType().getId(),
                from.getAppointment() == null ? null : from.getAppointment().getId(),
                from.getPatientCase() == null ? null : from.getPatientCase().getId(),
                from.getPatient() == null ? null : from.getPatient().getId(),
                from.getInDepartment() == null ? null : from.getInDepartment().getId()
        );
    }

    public List<DocumentDto> convert(List<Document> from) {
        return from.stream().map(this::convert).toList();
    }
}
