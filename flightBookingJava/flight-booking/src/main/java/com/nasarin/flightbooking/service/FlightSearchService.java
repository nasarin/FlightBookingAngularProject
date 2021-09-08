package com.nasarin.flightbooking.service;

import com.nasarin.flightbooking.dto.FlightSearchDto;
import com.nasarin.flightbooking.dto.UserRegisterRequestDto;
import com.nasarin.flightbooking.model.FlightSearch;
import com.nasarin.flightbooking.model.User;
import com.nasarin.flightbooking.repository.FlightSearchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class FlightSearchService {

    @Autowired
    private FlightSearchRepository flightSearchRepository;

    public  String searchFlight(FlightSearchDto flightSearchDto) {

        String resultMsg = "";
        FlightSearch flightSearch = toRegisterEntity(flightSearchDto);

        FlightSearch savedUser  =  flightSearchRepository.save(flightSearch);

        if(Objects.nonNull(savedUser)){
            resultMsg = "Success";
        }else{
            resultMsg = "Failure";
        }

        return resultMsg;
    }

    private FlightSearch toRegisterEntity(FlightSearchDto flightSearchDto) {
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.setAirlineName(flightSearchDto.getAirlineName());
        flightSearch.setStartDateTime(flightSearchDto.getStartDateTime());
        flightSearch.setEndDatetime(flightSearchDto.getEndDatetime());
        flightSearch.setTicketCost(flightSearchDto.getTicketCost());

        return  flightSearch;
    }
}
