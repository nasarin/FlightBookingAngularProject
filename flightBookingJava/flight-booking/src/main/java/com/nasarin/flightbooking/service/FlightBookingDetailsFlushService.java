package com.nasarin.flightbooking.service;

import com.nasarin.flightbooking.repository.FlightBookingRepository;
import com.nasarin.flightbooking.repository.FlightDetailsFlushRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingDetailsFlushService {
    @Autowired
    private FlightDetailsFlushRepository flightDetailsFlushRepository;

    public void delete(int pnrNo)
    {
        flightDetailsFlushRepository.deleteById(pnrNo);
    }
}
