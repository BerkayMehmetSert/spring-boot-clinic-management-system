package com.bms.clinicmanagementsystem.dto.converter;

import com.bms.clinicmanagementsystem.dto.ClinicDto;
import com.bms.clinicmanagementsystem.model.Clinic;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClinicDtoConverter {
    private final ClinicDepartmentDtoConverter clinicDepartmentDtoConverter;

    public ClinicDtoConverter(ClinicDepartmentDtoConverter clinicDepartmentDtoConverter) {
        this.clinicDepartmentDtoConverter = clinicDepartmentDtoConverter;
    }

    public ClinicDto convert(Clinic from) {
        return new ClinicDto(
                from.getId(),
                from.getName(),
                from.getAddress(),
                from.getDetail(),
                from.getDepartments() != null ? clinicDepartmentDtoConverter.convert(from.getDepartments()) : null
        );
    }

    public List<ClinicDto> convert(List<Clinic> from) {
        return from.stream().map(this::convert).toList();
    }
}
