package com.nasarin.flightbooking.repository;

import com.nasarin.flightbooking.model.FlightDetails;
import org.springframework.data.repository.CrudRepository;

public interface FlightDetailsFlushRepository extends CrudRepository<FlightDetails, Integer> {
}
