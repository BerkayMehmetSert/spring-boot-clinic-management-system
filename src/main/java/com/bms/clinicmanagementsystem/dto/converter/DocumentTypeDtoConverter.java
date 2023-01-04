package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.DocumentTypeDto;
import com.bms.clinicmanagementsystem.model.DocumentType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentTypeDtoConverter {
    private final DocumentTypeDocumentDtoConverter documentTypeDocumentDtoConverter;

    public DocumentTypeDtoConverter(DocumentTypeDocumentDtoConverter documentTypeDocumentDtoConverter) {
        this.documentTypeDocumentDtoConverter = documentTypeDocumentDtoConverter;
    }

    public DocumentTypeDto convert(DocumentType from) {
        return new DocumentTypeDto(
                from.getId(),
                from.getName(),
                from.getDocuments() == null ? null : documentTypeDocumentDtoConverter.convert(from.getDocuments())
        );
    }

    public List<DocumentTypeDto> convert(List<DocumentType> from) {
        return from.stream().map(this::convert).toList();
    }
}
