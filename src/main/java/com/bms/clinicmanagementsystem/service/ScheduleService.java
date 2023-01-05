package com.bms.clinicmanagementsystem.service;

import com.bms.clinicmanagementsystem.dto.ScheduleDto;
import com.bms.clinicmanagementsystem.dto.converter.ScheduleDtoConverter;
import com.bms.clinicmanagementsystem.exception.ScheduleDateIsBeforeTodayException;
import com.bms.clinicmanagementsystem.exception.ScheduleNotFoundException;
import com.bms.clinicmanagementsystem.helper.DateHelper;
import com.bms.clinicmanagementsystem.helper.message.BusinessLogMessage;
import com.bms.clinicmanagementsystem.helper.message.BusinessMessage;
import com.bms.clinicmanagementsystem.model.Schedule;
import com.bms.clinicmanagementsystem.repository.ScheduleRepository;
import com.bms.clinicmanagementsystem.request.schedule.CreateScheduleRequest;
import com.bms.clinicmanagementsystem.request.schedule.UpdateScheduleRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    private final InDepartmentService inDepartmentService;
    private final ScheduleDtoConverter converter;

    public ScheduleService(ScheduleRepository scheduleRepository,
                           InDepartmentService inDepartmentService,
                           ScheduleDtoConverter converter) {
        this.scheduleRepository = scheduleRepository;
        this.inDepartmentService = inDepartmentService;
        this.converter = converter;
    }

    public void createSchedule(final CreateScheduleRequest request) {
        Schedule schedule = new Schedule();

        checkScheduleDate(request.getDate());

        schedule.setDate(request.getDate());
        schedule.setStartTime(request.getStartTime());
        schedule.setEndTime(request.getEndTime());
        schedule.setInDepartment(inDepartmentService.findInDepartmentByInDepartmentId(request.getInDepartmentId()));

        scheduleRepository.save(schedule);
        log.info(BusinessLogMessage.Schedule.SCHEDULE_CREATED);
    }

    public void updateSchedule(final String id, final UpdateScheduleRequest request) {
        Schedule schedule = findScheduleByScheduleId(id);

        if (!schedule.getDate().equals(request.getDate())) {
            checkScheduleDate(request.getDate());
        }

        schedule.setDate(request.getDate());
        schedule.setStartTime(request.getStartTime());
        schedule.setEndTime(request.getEndTime());
        schedule.setInDepartment(inDepartmentService.findInDepartmentByInDepartmentId(request.getInDepartmentId()));

        scheduleRepository.save(schedule);
        log.info(BusinessLogMessage.Schedule.SCHEDULE_UPDATED + id);
    }

    public void deleteSchedule(final String id) {
        scheduleRepository.delete(findScheduleByScheduleId(id));
        log.info(BusinessLogMessage.Schedule.SCHEDULE_DELETED + id);
    }

    public ScheduleDto findScheduleById(final String id) {
        Schedule schedule = findScheduleByScheduleId(id);

        log.info(BusinessLogMessage.Schedule.SCHEDULE_FOUND + id);
        return converter.convert(schedule);
    }

    public List<ScheduleDto> findAllSchedules() {
        List<Schedule> schedules = scheduleRepository.findAll();

        if (schedules.isEmpty()) {
            log.info(BusinessLogMessage.Schedule.SCHEDULE_LIST_EMPTY);
            throw new ScheduleNotFoundException(BusinessMessage.Schedule.SCHEDULE_LIST_EMPTY);
        }

        log.info(BusinessLogMessage.Schedule.SCHEDULE_LIST_FOUND);
        return converter.convert(schedules);
    }

    private Schedule findScheduleByScheduleId(final String id) {
        return scheduleRepository.findById(id)
                .orElseThrow(() -> {
                    log.error(BusinessLogMessage.Schedule.SCHEDULE_NOT_FOUND + id);
                    return new ScheduleNotFoundException(BusinessMessage.Schedule.SCHEDULE_NOT_FOUND);
                });
    }

    private void checkScheduleDate(final LocalDate date) {
        final LocalDate today = DateHelper.getToday();

        if (date.isBefore(today)) {
            log.error(BusinessLogMessage.Schedule.SCHEDULE_DATE_IS_BEFORE_TODAY);
            throw new ScheduleDateIsBeforeTodayException(BusinessMessage.Schedule.SCHEDULE_DATE_IS_BEFORE_TODAY);
        }
    }
}
