package com.nasarin.flightbooking.service;

import com.nasarin.flightbooking.dto.ScheduleAirlineDto;
import com.nasarin.flightbooking.dto.UserRegisterRequestDto;
import com.nasarin.flightbooking.model.ScheduleAirline;
import com.nasarin.flightbooking.model.User;
import com.nasarin.flightbooking.repository.ScheduleAirlineRepository;
import com.nasarin.flightbooking.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ScheduleAirlineService {
    @Autowired
    private ScheduleAirlineRepository scheduleAirlineRepository;

    public  String scheduleAirline(ScheduleAirlineDto scheduleAirlineDto) {

        String resultMsg = "";
        ScheduleAirline scheduleAirline = toRegisterEntity(scheduleAirlineDto);
//have to check the airline time and all details
        ScheduleAirline savedUser  =  scheduleAirlineRepository.save(scheduleAirline);

        if(Objects.nonNull(savedUser)){
            resultMsg = "Success";
        }else{
            resultMsg = "Failure";
        }

        return resultMsg;
    }

    private ScheduleAirline toRegisterEntity(ScheduleAirlineDto scheduleAirlineDto) {

        ScheduleAirline scheduleAirline = new ScheduleAirline();
        scheduleAirline.setFlightId(scheduleAirlineDto.getFlightId());
        scheduleAirline.setAirlineName(scheduleAirlineDto.getAirlineName());
        scheduleAirline.setScheduledDay(scheduleAirlineDto.getScheduledDay());
        scheduleAirline.setEndDatetime(scheduleAirlineDto.getEndDatetime());
        scheduleAirline.setStartDateTime(scheduleAirlineDto.getStartDateTime());
        scheduleAirline.setFromPlace(scheduleAirlineDto.getFromPlace());
        scheduleAirline.setInstrumentUsed(scheduleAirlineDto.getInstrumentUsed());
        scheduleAirline.setMeal(scheduleAirlineDto.getMeal());
        scheduleAirline.setNoOfRows(scheduleAirlineDto.getNoOfRows());
        scheduleAirline.setTicketCost(scheduleAirlineDto.getTicketCost());
        scheduleAirline.setToPlace(scheduleAirlineDto.getToPlace());
        scheduleAirline.setTotalNoOfBusinessSeats(scheduleAirlineDto.getTotalNoOfBusinessSeats());
        scheduleAirline.setTotalNoOfBusinessSeats(scheduleAirlineDto.getTotalNoOfNonBusinessSeats());


        return  scheduleAirline;
    }


}
