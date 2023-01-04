package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.InDepartmentDocumentDto;
import com.bms.clinicmanagementsystem.model.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InDepartmentDocumentDtoConverter {
    public InDepartmentDocumentDto convert(Document from) {
        return new InDepartmentDocumentDto(
                from.getId(),
                from.getDocumentInternalId(),
                from.getName(),
                from.getUrl(),
                from.getDetail(),
                from.getDocumentType() != null ? from.getDocumentType().getId() : null,
                from.getAppointment() != null ? from.getAppointment().getId() : null,
                from.getPatientCase() != null ? from.getPatientCase().getId() : null,
                from.getPatient() != null ? from.getPatient().getId() : null
        );
    }

    public List<InDepartmentDocumentDto> convert(List<Document> from) {
        return from.stream().map(this::convert).toList();
    }
}
