package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.dto.StatusDto;
import com.bms.clinicmanagementsystem.dto.converter.StatusDtoConverter;
import com.bms.clinicmanagementsystem.exception.StatusAlreadyExistException;
import com.bms.clinicmanagementsystem.exception.StatusNotFoundException;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;
import com.bms.clinicmanagementsystem.model.Status;
import com.bms.clinicmanagementsystem.repository.StatusRepository;
import com.bms.clinicmanagementsystem.request.status.CreateStatusRequest;
import com.bms.clinicmanagementsystem.request.status.UpdateStatusRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StatusService {
    private final StatusRepository statusRepository;
    private final StatusDtoConverter converter;

    public StatusService(StatusRepository statusRepository, StatusDtoConverter converter) {
        this.statusRepository = statusRepository;
        this.converter = converter;
    }

    public void createStatus(final CreateStatusRequest request) {
        Status status = new Status();

        checkStatusExists(request.getName());

        status.setName(request.getName());

        statusRepository.save(status);
        log.info(BusinessLogMessage.Status.STATUS_CREATED);
    }

    public void updateStatus(final String id, final UpdateStatusRequest request) {
        Status status = findStatusByStatusId(id);

        if (!status.getName().equals(request.getName())) {
            checkStatusExists(request.getName());
        }

        status.setName(request.getName());

        statusRepository.save(status);
        log.info(BusinessLogMessage.Status.STATUS_UPDATED + id);
    }

    public void deleteStatus(final String id) {
        Status status = findStatusByStatusId(id);

        statusRepository.delete(status);
        log.info(BusinessLogMessage.Status.STATUS_DELETED + id);
    }

    public StatusDto findStatusById(final String id) {
        Status status = findStatusByStatusId(id);

        log.info(BusinessLogMessage.Status.STATUS_FOUND + id);
        return converter.convert(status);
    }

    public List<StatusDto> findAllStatuses() {
        List<Status> statuses = statusRepository.findAll();

        if (statuses.isEmpty()) {
            log.info(BusinessLogMessage.Status.STATUS_LIST_EMPTY);
            throw new StatusNotFoundException(BusinessMessage.Status.STATUS_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.Status.STATUS_LIST_FOUND);
        return converter.convert(statuses);
    }

    protected Status findStatusByStatusId(final String id) {
        return statusRepository.findById(id).orElseThrow(() -> {
            log.error(BusinessLogMessage.Status.STATUS_NOT_FOUND, id);
            throw new StatusAlreadyExistException(BusinessMessage.Status.STATUS_NOT_FOUND);
        });
    }

    private void checkStatusExists(final String name) {
        if (statusRepository.existsByNameIgnoreCase(name)) {
            log.error(BusinessLogMessage.Status.STATUS_ALREADY_EXISTS + name);
            throw new StatusAlreadyExistException(BusinessMessage.Status.STATUS_ALREADY_EXISTS);
        }
    }
}
