package com.nasarin.flightbooking.repository;

import com.nasarin.flightbooking.model.FlightSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightSearchRepository extends JpaRepository<FlightSearch, Integer> {
}
