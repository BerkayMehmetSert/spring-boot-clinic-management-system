package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.InDepartmentAppointmentDto;
import com.bms.clinicmanagementsystem.model.Appointment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InDepartmentAppointmentDtoConverter {
    public InDepartmentAppointmentDto convert(Appointment from) {
        return new InDepartmentAppointmentDto(
                from.getId(),
                from.getStartTime(),
                from.getEndTime(),
                from.getStatus() != null ? from.getStatus().getId() : null,
                from.getPatientCase() != null ? from.getPatientCase().getId() : null
        );
    }

    public List<InDepartmentAppointmentDto> convert(List<Appointment> from) {
        return from.stream().map(this::convert).toList();
    }
}
