package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.DocumentTypeDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.documenttype.CreateDocumentTypeRequest;
import com.bms.clinicmanagementsystem.request.documenttype.UpdateDocumentTypeRequest;
import com.bms.clinicmanagementsystem.service.DocumentTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/document-types")
@Slf4j
public class DocumentTypeController {
    private final DocumentTypeService documentTypeService;

    public DocumentTypeController(DocumentTypeService documentTypeService) {
        this.documentTypeService = documentTypeService;
    }

    @PostMapping
    public ResponseEntity<Void> createDocumentType(@RequestBody CreateDocumentTypeRequest request){
        documentTypeService.createDocumentType(request);

        log.info(ControllerLogMessage.DocumentType.DOCUMENT_TYPE_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDocumentType(@PathVariable String id,
                                                   @RequestBody UpdateDocumentTypeRequest request){
        documentTypeService.updateDocumentType(id, request);

        log.info(ControllerLogMessage.DocumentType.DOCUMENT_TYPE_UPDATE + id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocumentType(@PathVariable String id){
        documentTypeService.deleteDocumentType(id);

        log.info(ControllerLogMessage.DocumentType.DOCUMENT_TYPE_DELETE + id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocumentTypeDto> findDocumentTypeById(@PathVariable String id){
        DocumentTypeDto documentType = documentTypeService.findDocumentTypeById(id);

        log.info(ControllerLogMessage.DocumentType.DOCUMENT_TYPE_FIND + id);
        return ResponseEntity.ok(documentType);
    }

    @GetMapping
    public ResponseEntity<List<DocumentTypeDto>> findAllDocumentTypes(){
        List<DocumentTypeDto> documentTypes = documentTypeService.findAllDocumentTypes();

        log.info(ControllerLogMessage.DocumentType.DOCUMENT_TYPE_FIND_ALL);
        return ResponseEntity.ok(documentTypes);
    }
}
