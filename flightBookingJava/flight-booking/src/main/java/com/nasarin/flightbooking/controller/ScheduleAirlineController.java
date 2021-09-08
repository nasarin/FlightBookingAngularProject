package com.nasarin.flightbooking.controller;

import com.nasarin.flightbooking.dto.ScheduleAirlineDto;
import com.nasarin.flightbooking.dto.UserRegisterRequestDto;
import com.nasarin.flightbooking.service.RegisterService;
import com.nasarin.flightbooking.service.ScheduleAirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1.0/flight/airline")
@RestController
public class ScheduleAirlineController {
    @Autowired
    private ScheduleAirlineService scheduleAirlineService;

    @PostMapping("/inventory/add")
    public ResponseEntity<String> scheduleAirline(@RequestBody ScheduleAirlineDto scheduleAirlineDto){
        return ResponseEntity.ok( scheduleAirlineService.scheduleAirline(scheduleAirlineDto));
    }






}
