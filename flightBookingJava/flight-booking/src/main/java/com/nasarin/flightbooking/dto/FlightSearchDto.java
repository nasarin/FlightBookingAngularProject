package com.nasarin.flightbooking.dto;
import lombok.Data;

@Data
public class FlightSearchDto {
    private String startDateTime ;
    private String endDatetime ;
    private String airlineName ;
    private String ticketCost ;
    private int pnrNo;
}
