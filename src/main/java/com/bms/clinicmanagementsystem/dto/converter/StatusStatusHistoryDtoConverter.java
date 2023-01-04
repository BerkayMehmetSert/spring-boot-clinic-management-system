package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.StatusStatusHistoryDto;
import com.bms.clinicmanagementsystem.model.StatusHistory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StatusStatusHistoryDtoConverter {
    public StatusStatusHistoryDto convert(StatusHistory from) {
        return new StatusStatusHistoryDto(
                from.getId(),
                from.getTime(),
                from.getDescription(),
                from.getAppointment() != null ? from.getAppointment().getId() : null
        );
    }

    public List<StatusStatusHistoryDto> convert(List<StatusHistory> from) {
        return from.stream().map(this::convert).toList();
    }
}
