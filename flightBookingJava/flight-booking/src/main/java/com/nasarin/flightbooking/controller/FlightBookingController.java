package com.nasarin.flightbooking.controller;

import com.nasarin.flightbooking.dto.ResponseDto;
import com.nasarin.flightbooking.dto.ScheduleAirlineDto;
import com.nasarin.flightbooking.dto.TicketBookingDto;
import com.nasarin.flightbooking.service.FlightBookingService;
import com.nasarin.flightbooking.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1.0/flight/booking")
@RestController
public class FlightBookingController {
    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping
    public ResponseEntity<String> ticketBooking(@RequestBody TicketBookingDto ticketBookingDto){
        return ResponseEntity.ok( flightBookingService.ticketBooking(ticketBookingDto));
    }

    @GetMapping("/viewTicket")
    public ResponseEntity<ResponseDto> getBookedTicketByPnrNo(@RequestParam String pnrNo){
        return ResponseEntity.ok(flightBookingService.getBookedTicketByPnrNo(pnrNo));
    }
    @GetMapping("/viewHistory")
    public ResponseEntity<ResponseDto> getBookedTicketByEmailId(@RequestParam String emailId){
        return ResponseEntity.ok(flightBookingService.getBookedTicketByEmailId(emailId));
    }

    /*@DeleteMapping("/deleteFlight")
    public ResponseEntity<Boolean> deleteFlightDetails(@RequestParam String pnrNo){
        return ResponseEntity.ok(flightBookingService.deleteFlightDetails(pnrNo));
    }*/
}
