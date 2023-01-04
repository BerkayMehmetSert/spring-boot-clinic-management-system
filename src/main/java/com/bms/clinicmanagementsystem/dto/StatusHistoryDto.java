package com.bms.clinicmanagementsystem.dto;

import java.time.LocalDateTime;

public record StatusHistoryDto(
    String id,
    LocalDateTime time,
    String description,
    String statusId,
    String appointmentId
) {
}
