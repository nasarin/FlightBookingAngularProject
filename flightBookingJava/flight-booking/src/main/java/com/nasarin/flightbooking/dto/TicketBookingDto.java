package com.nasarin.flightbooking.dto;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class TicketBookingDto {
    private String flightId ;
    private String name ;
    private String emailId ;
    private String noOfSeats ;
    //private Set<PassengerDetails> passengerDetails ;
    private String meal ;
    private String seatNo;
    private String pnrNo;
    private String status;
}
