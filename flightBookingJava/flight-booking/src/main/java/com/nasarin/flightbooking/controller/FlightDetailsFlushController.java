package com.nasarin.flightbooking.controller;

import com.nasarin.flightbooking.service.FlightBookingDetailsFlushService;
import com.nasarin.flightbooking.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1.0/flight/booking/delete")
@RestController

public class FlightDetailsFlushController {
    @Autowired
    private FlightBookingDetailsFlushService flightBookingDetailsFlushService;

    @DeleteMapping("/flight")
    private void deleteBook(@RequestParam int pnrNo)
    {
        flightBookingDetailsFlushService.delete(pnrNo);
    }
}
