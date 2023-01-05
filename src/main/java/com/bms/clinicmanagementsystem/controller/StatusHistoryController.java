package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.StatusHistoryDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.satushistory.CreateStatusHistoryRequest;
import com.bms.clinicmanagementsystem.request.satushistory.UpdateStatusHistoryRequest;
import com.bms.clinicmanagementsystem.service.StatusHistoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/status-history")
@Slf4j
public class StatusHistoryController {
    private final StatusHistoryService statusHistoryService;

    public StatusHistoryController(StatusHistoryService statusHistoryService) {
        this.statusHistoryService = statusHistoryService;
    }

    @PostMapping
    public ResponseEntity<Void> createStatusHistory(@RequestBody CreateStatusHistoryRequest request) {
        statusHistoryService.createStatusHistory(request);

        log.info(ControllerLogMessage.StatusHistory.STATUS_HISTORY_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStatusHistory(@PathVariable String id,
                                                    @RequestBody UpdateStatusHistoryRequest request) {
        statusHistoryService.updateStatusHistory(id, request);

        log.info(ControllerLogMessage.StatusHistory.STATUS_HISTORY_UPDATE + id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStatusHistory(@PathVariable String id) {
        statusHistoryService.deleteStatusHistory(id);

        log.info(ControllerLogMessage.StatusHistory.STATUS_HISTORY_DELETE + id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusHistoryDto> findStatusHistoryById(@PathVariable String id) {
        StatusHistoryDto statusHistory = statusHistoryService.findStatusHistoryById(id);

        log.info(ControllerLogMessage.StatusHistory.STATUS_HISTORY_FIND + id);
        return ResponseEntity.ok(statusHistory);
    }

    @GetMapping
    public ResponseEntity<List<StatusHistoryDto>> findAllStatusHistory() {
        List<StatusHistoryDto> statusHistoryList = statusHistoryService.findAllStatusHistory();

        log.info(ControllerLogMessage.StatusHistory.STATUS_HISTORY_FIND_ALL);
        return ResponseEntity.ok(statusHistoryList);
    }
}
