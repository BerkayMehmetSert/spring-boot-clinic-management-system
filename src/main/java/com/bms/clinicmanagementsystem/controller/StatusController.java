package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.StatusDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.status.CreateStatusRequest;
import com.bms.clinicmanagementsystem.request.status.UpdateStatusRequest;
import com.bms.clinicmanagementsystem.service.StatusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/statuses")
@Slf4j
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping
    public ResponseEntity<Void> createStatus(@RequestBody CreateStatusRequest request) {
        statusService.createStatus(request);

        log.info(ControllerLogMessage.Status.STATUS_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStatus(@PathVariable String id, @RequestBody UpdateStatusRequest request) {
        statusService.updateStatus(id, request);

        log.info(ControllerLogMessage.Status.STATUS_UPDATE + id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStatus(@PathVariable String id) {
        statusService.deleteStatus(id);

        log.info(ControllerLogMessage.Status.STATUS_DELETE + id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusDto> findStatusById(@PathVariable String id) {
        StatusDto status = statusService.findStatusById(id);

        log.info(ControllerLogMessage.Status.STATUS_FIND + id);
        return ResponseEntity.ok(status);
    }

    @GetMapping
    public ResponseEntity<List<StatusDto>> findAllStatus() {
        List<StatusDto> status = statusService.findAllStatuses();

        log.info(ControllerLogMessage.Status.STATUS_FIND_ALL);
        return ResponseEntity.ok(status);
    }
}
