package com.bms.clinicmanagementsystem.controller;

import com.bms.clinicmanagementsystem.dto.AppointmentDto;
import com.bms.clinicmanagementsystem.helper.message.ControllerLogMessage;
import com.bms.clinicmanagementsystem.request.appointment.CreateAppointmentRequest;
import com.bms.clinicmanagementsystem.request.appointment.UpdateAppointmentRequest;
import com.bms.clinicmanagementsystem.service.AppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointment")
@Slf4j
public class AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public ResponseEntity<Void> createAppointment(@RequestBody CreateAppointmentRequest request) {
        appointmentService.createAppointment(request);

        log.info(ControllerLogMessage.Appointment.APPOINTMENT_CREATE);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateAppointment(@PathVariable String id,
                                                  @RequestBody UpdateAppointmentRequest request) {
        appointmentService.updateAppointment(id, request);

        log.info(ControllerLogMessage.Appointment.APPOINTMENT_UPDATE);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable String id) {
        appointmentService.deleteAppointment(id);

        log.info(ControllerLogMessage.Appointment.APPOINTMENT_DELETE);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AppointmentDto> findAppointmentById(@PathVariable String id) {
        AppointmentDto appointment = appointmentService.findAppointmentById(id);

        log.info(ControllerLogMessage.Appointment.APPOINTMENT_FIND);
        return ResponseEntity.ok(appointment);
    }

    @GetMapping
    public ResponseEntity<List<AppointmentDto>> findAllAppointments() {
        List<AppointmentDto> appointments = appointmentService.findAllAppointments();

        log.info(ControllerLogMessage.Appointment.APPOINTMENT_FIND_ALL);
        return ResponseEntity.ok(appointments);
    }
}
