package com.vnc.smarthomestay.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vnc.smarthomestay.entity.ReservationRequest;
import com.vnc.smarthomestay.entity.Room;
import com.vnc.smarthomestay.service.RoomService;
import com.vnc.smarthomestay.service.ShowRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping
    public List<ShowRoom> getAllMember(){
        return roomService.getAllRoom();
    }


}
