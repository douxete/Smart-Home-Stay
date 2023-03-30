package com.vnc.smarthomestay.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vnc.smarthomestay.entity.ReservationRequest;
import com.vnc.smarthomestay.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @PostMapping
    public String reserveRoom(@RequestBody ReservationRequest reservationRequest) throws JsonProcessingException {
        return reservationService.reserveRoom(reservationRequest);
    }
}
