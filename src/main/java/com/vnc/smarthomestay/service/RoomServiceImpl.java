package com.vnc.smarthomestay.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vnc.smarthomestay.config.KafkaConfig;
import com.vnc.smarthomestay.entity.EmailMessage;
import com.vnc.smarthomestay.entity.ReservationRequest;
import com.vnc.smarthomestay.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public List<ShowRoom> getAllRoom() {
        return roomRepository.findAllRooms();
    }




}
