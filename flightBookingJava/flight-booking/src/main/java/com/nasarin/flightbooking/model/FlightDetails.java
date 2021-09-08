package com.nasarin.flightbooking.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
public class FlightDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String flightId ;
    private String name ;
    private String emailId ;
    private String noOfSeats ;
    //private Set<PassengerDetails> passengerDetails ;
    private String meal ;
    private String seatNo;
    private String pnrNo;
    private String Status;
}
