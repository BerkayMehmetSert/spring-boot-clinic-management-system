package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.DocumentTypeDocumentDto;
import com.bms.clinicmanagementsystem.model.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentTypeDocumentDtoConverter {
    public DocumentTypeDocumentDto convert(Document from) {
        return new DocumentTypeDocumentDto(
                from.getId(),
                from.getDocumentInternalId(),
                from.getName(),
                from.getUrl(),
                from.getDetail(),
                from.getAppointment() == null ? null : from.getAppointment().getId(),
                from.getPatientCase() == null ? null : from.getPatientCase().getId(),
                from.getPatient() == null ? null : from.getPatient().getId(),
                from.getInDepartment() == null ? null : from.getInDepartment().getId()
        );
    }

    public List<DocumentTypeDocumentDto> convert(List<Document> from) {
        return from.stream().map(this::convert).toList();
    }
}
