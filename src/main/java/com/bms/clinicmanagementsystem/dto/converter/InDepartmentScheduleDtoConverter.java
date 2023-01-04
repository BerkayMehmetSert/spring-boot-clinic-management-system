package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.InDepartmentScheduleDto;
import com.bms.clinicmanagementsystem.model.Schedule;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InDepartmentScheduleDtoConverter {
    public InDepartmentScheduleDto convert(Schedule from) {
        return new InDepartmentScheduleDto(
                from.getId(),
                from.getDate(),
                from.getStartTime(),
                from.getEndTime()
        );
    }

    public List<InDepartmentScheduleDto> convert(List<Schedule> from) {
        return from.stream().map(this::convert).toList();
    }
}
