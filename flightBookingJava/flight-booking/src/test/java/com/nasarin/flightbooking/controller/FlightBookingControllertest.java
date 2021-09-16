package com.nasarin.flightbooking.controller;

import com.nasarin.flightbooking.dto.TicketBookingDto;
import com.nasarin.flightbooking.model.FlightDetails;
import com.nasarin.flightbooking.service.FlightBookingService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.reactive.server.StatusAssertions;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;

@WebMvcTest
class FlightBookingControllertest {
    @Autowired
    private MockMvc mockMvc;

    @Mock
    private FlightBookingController flightBookingController;

    @Mock
    private FlightBookingService flightBookingService;
    @Mock
    private ResponseEntity responseEntity;
    @Test
    public void testTicketBooking() throws Exception {

        List<TicketBookingDto> flightDetailsList = new ArrayList<>();
        TicketBookingDto ticketBookingDto = new TicketBookingDto();
        Mockito.when(flightBookingController.ticketBooking(ticketBookingDto)).thenReturn(responseEntity);
        flightBookingController.ticketBooking(ticketBookingDto);
    }



}
