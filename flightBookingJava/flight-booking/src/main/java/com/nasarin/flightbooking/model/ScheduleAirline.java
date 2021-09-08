package com.nasarin.flightbooking.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class ScheduleAirline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flightId ;
    private String airlineName ;
    private String fromPlace ;
    private String toPlace ;
    private String startDateTime ;
    private String endDatetime ;
    private String scheduledDay ;
    private String instrumentUsed ;
    private String totalNoOfBusinessSeats ;
    private String totalNoOfNonBusinessSeats ;
    private String ticketCost ;
    private String noOfRows ;
    private String meal ;

}
