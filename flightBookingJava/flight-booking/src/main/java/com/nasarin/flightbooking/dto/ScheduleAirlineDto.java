package com.nasarin.flightbooking.dto;

import lombok.Data;

@Data
public class ScheduleAirlineDto {
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
