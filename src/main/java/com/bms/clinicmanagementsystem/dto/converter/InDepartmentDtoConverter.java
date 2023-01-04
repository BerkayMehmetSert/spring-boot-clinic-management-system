package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.InDepartmentDto;
import com.bms.clinicmanagementsystem.model.InDepartment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InDepartmentDtoConverter {
    private final InDepartmentScheduleDtoConverter inDepartmentScheduleDtoConverter;
    private final InDepartmentAppointmentDtoConverter inDepartmentAppointmentDtoConverter;
    private final InDepartmentDocumentDtoConverter inDepartmentDocumentDtoConverter;

    public InDepartmentDtoConverter(InDepartmentScheduleDtoConverter inDepartmentScheduleDtoConverter,
                                    InDepartmentAppointmentDtoConverter inDepartmentAppointmentDtoConverter,
                                    InDepartmentDocumentDtoConverter inDepartmentDocumentDtoConverter) {
        this.inDepartmentScheduleDtoConverter = inDepartmentScheduleDtoConverter;
        this.inDepartmentAppointmentDtoConverter = inDepartmentAppointmentDtoConverter;
        this.inDepartmentDocumentDtoConverter = inDepartmentDocumentDtoConverter;
    }

    public InDepartmentDto convert(InDepartment from) {
        return new InDepartmentDto(
                from.getId(),
                from.getTimeFrom(),
                from.getTimeTo(),
                from.getIsActive(),
                from.getDepartment() != null ? from.getDepartment().getId() : null,
                from.getEmployee() != null ? from.getEmployee().getId() : null,
                from.getSchedules() != null ? inDepartmentScheduleDtoConverter.convert(from.getSchedules()) : null,
                from.getAppointments() != null ? inDepartmentAppointmentDtoConverter.convert(from.getAppointments()) : null,
                from.getDocuments() != null ? inDepartmentDocumentDtoConverter.convert(from.getDocuments()) : null);
    }

    public List<InDepartmentDto> convert(List<InDepartment> from) {
        return from.stream().map(this::convert).toList();
    }
}
