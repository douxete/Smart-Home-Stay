package com.vnc.smarthomestay.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vnc.smarthomestay.entity.ReservationRequest;
import com.vnc.smarthomestay.entity.Room;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RoomService {

    public List<ShowRoom> getAllRoom();


}
