package com.nasarin.flightbooking.service;

import com.nasarin.flightbooking.dto.ResponseDto;
import com.nasarin.flightbooking.dto.ScheduleAirlineDto;
import com.nasarin.flightbooking.dto.TicketBookingDto;
import com.nasarin.flightbooking.dto.UserRegisterRequestDto;
import com.nasarin.flightbooking.model.FlightDetails;
import com.nasarin.flightbooking.model.ScheduleAirline;
import com.nasarin.flightbooking.model.User;
import com.nasarin.flightbooking.repository.FlightBookingRepository;
import com.nasarin.flightbooking.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class FlightBookingService {
    @Autowired
    private FlightBookingRepository flightBookingRepository;

    public  String ticketBooking(TicketBookingDto ticketBookingDto) {

        String resultMsg = "";
        FlightDetails flightDetails = toRegisterEntity(ticketBookingDto);

        FlightDetails savedUser  =  flightBookingRepository.save(flightDetails);

        if(Objects.nonNull(savedUser)){
            resultMsg = "Success";
        }else{
            resultMsg = "Failure";
        }

        return resultMsg;
    }

    private FlightDetails toRegisterEntity(TicketBookingDto ticketBookingDto) {
        FlightDetails flightDetails = new FlightDetails();
        flightDetails.setName(ticketBookingDto.getName());
        flightDetails.setEmailId(ticketBookingDto.getEmailId());
        flightDetails.setNoOfSeats(ticketBookingDto.getNoOfSeats());
        flightDetails.setMeal(ticketBookingDto.getMeal());
        flightDetails.setFlightId(ticketBookingDto.getFlightId());
        //flightDetails.setPassengerDetails(ticketBookingDto.getPassengerDetails());
        flightDetails.setSeatNo(ticketBookingDto.getSeatNo());
        flightDetails.setPnrNo(ticketBookingDto.getPnrNo());
        flightDetails.setStatus(ticketBookingDto.getStatus());
        return  flightDetails;
    }

    public ResponseDto getBookedTicketByPnrNo(int pnrNo){
        ResponseDto responseDto= new ResponseDto();

        FlightDetails   flightDetails=  flightBookingRepository.findByPnrNo(pnrNo);

        if(Objects.nonNull(flightDetails)){
            responseDto.setMsg("Success");
            responseDto.setResult(flightDetails);
        }else{
            responseDto.setMsg("Failure");
        }

        return responseDto;
    }

    public ResponseDto getBookedTicketByEmailId(String emailId){
        ResponseDto responseDto= new ResponseDto();

        List<FlightDetails>   flightDetails=  flightBookingRepository.findByEmailId(emailId);

        if(Objects.nonNull(flightDetails)){
            responseDto.setMsg("Success");
            responseDto.setResult(flightDetails);
        }else{
            responseDto.setMsg("Failure");
        }

        return responseDto;
    }



}
