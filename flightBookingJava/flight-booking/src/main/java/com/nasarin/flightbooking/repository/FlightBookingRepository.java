package com.nasarin.flightbooking.repository;

import com.nasarin.flightbooking.model.FlightDetails;
import com.nasarin.flightbooking.model.ScheduleAirline;
import com.nasarin.flightbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightDetails, Integer> {
    FlightDetails findByPnrNo (String pnrNo);
    //FlightDetails saveFlightDetails (FlightDetails flightDetailsBooking);

    List<FlightDetails>  findByEmailId(String emailId);
}
