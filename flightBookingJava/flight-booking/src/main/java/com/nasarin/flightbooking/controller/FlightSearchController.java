package com.nasarin.flightbooking.controller;

import com.nasarin.flightbooking.dto.FlightSearchDto;
import com.nasarin.flightbooking.dto.UserRegisterRequestDto;
import com.nasarin.flightbooking.service.FlightSearchService;
import com.nasarin.flightbooking.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1.0/flight/search")
@RestController
public class FlightSearchController {
    @Autowired
    private FlightSearchService flightSearchService;

    @PostMapping
    public ResponseEntity<String> searchFlight(@RequestBody FlightSearchDto flightSearchDto) {
        return ResponseEntity.ok(flightSearchService.searchFlight(flightSearchDto));
    }

}
