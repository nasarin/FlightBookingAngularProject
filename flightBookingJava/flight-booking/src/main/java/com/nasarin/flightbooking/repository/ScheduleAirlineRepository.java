package com.nasarin.flightbooking.repository;

import com.nasarin.flightbooking.model.ScheduleAirline;
import com.nasarin.flightbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleAirlineRepository extends JpaRepository<ScheduleAirline, Integer> {

}
