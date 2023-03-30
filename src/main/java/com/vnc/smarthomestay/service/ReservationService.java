package com.vnc.smarthomestay.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vnc.smarthomestay.entity.EmailMessage;
import com.vnc.smarthomestay.entity.ReservationRequest;

public interface ReservationService {

    void sendMessage(EmailMessage emailMessage) throws JsonProcessingException;
    public String reserveRoom(ReservationRequest reservationRequest) throws JsonProcessingException;
}
