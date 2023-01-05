package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.DocumentDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.document.CreateDocumentRequest;
import com.bms.clinicmanagementsystem.request.document.UpdateDocumentRequest;
import com.bms.clinicmanagementsystem.service.DocumentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.util.List;

@RestController
@RequestMapping("/api/v1/documents")
@Slf4j
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public ResponseEntity<Void> createDocument(@RequestBody CreateDocumentRequest request) {
        documentService.createDocument(request);

        log.info(ControllerLogMessage.Document.DOCUMENT_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDocument(@PathVariable String id,
                                               @RequestBody UpdateDocumentRequest request) {
        documentService.updateDocument(id, request);

        log.info(ControllerLogMessage.Document.DOCUMENT_UPDATE);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/{id}/pdf")
    public ResponseEntity<InputStreamResource> createDocumentPdf(@PathVariable String id) {
        ByteArrayInputStream pdf = documentService.createDocumentPdf(id);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=" + id + ".pdf");

        log.info(ControllerLogMessage.Document.DOCUMENT_PDF_CREATE);
        return ResponseEntity.ok().headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdf));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocument(@PathVariable String id) {
        documentService.deleteDocument(id);

        log.info(ControllerLogMessage.Document.DOCUMENT_DELETE);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocumentDto> findDocumentById(@PathVariable String id) {
        DocumentDto document = documentService.findDocumentById(id);

        log.info(ControllerLogMessage.Document.DOCUMENT_FIND);
        return ResponseEntity.ok(document);
    }

    @GetMapping
    public ResponseEntity<List<DocumentDto>> findAllDocuments() {
        List<DocumentDto> documents = documentService.findAllDocuments();

        log.info(ControllerLogMessage.Document.DOCUMENT_FIND_ALL);
        return ResponseEntity.ok(documents);
    }
}
