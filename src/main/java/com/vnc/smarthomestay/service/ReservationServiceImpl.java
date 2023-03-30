package com.vnc.smarthomestay.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vnc.smarthomestay.config.KafkaConfig;
import com.vnc.smarthomestay.entity.EmailMessage;
import com.vnc.smarthomestay.entity.ReservationRequest;
import com.vnc.smarthomestay.exception.DataNotFoundException;
import com.vnc.smarthomestay.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void sendMessage(EmailMessage message) throws JsonProcessingException {
        String emailMessage = objectMapper.writeValueAsString(message);
        this.kafkaTemplate.send(KafkaConfig.TOPIC,emailMessage);
    }

    @Override
    public String reserveRoom(ReservationRequest reservationRequest) throws JsonProcessingException {
        reservationRepository.save(reservationRequest);
        List<BillTotal> total = reservationRepository.sendBill();
        String bodyEmail = "Your total bill is "+total.get(0).getPrice().toString();
        String email = total.get(0).getEmailMember();
        EmailMessage message = new EmailMessage(email, "Bill Transaction", bodyEmail);
        String emailMessage = objectMapper.writeValueAsString(message);
        this.kafkaTemplate.send(KafkaConfig.TOPIC,emailMessage);
        return "Your Reservasion has been recorded";
    }
}
