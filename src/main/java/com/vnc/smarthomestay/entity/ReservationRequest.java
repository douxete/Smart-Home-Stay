package com.vnc.smarthomestay.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transaction")
public class ReservationRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int roomnumber;
    private String additionalname1;
    private String additionalname2;
    private String emailmember;

    public ReservationRequest() {
    }

    public ReservationRequest(int id, int roomnumber, String additionalname1, String additionalname2, String emailmember) {
        this.id = id;
        this.roomnumber = roomnumber;
        this.additionalname1 = additionalname1;
        this.additionalname2 = additionalname2;
        this.emailmember = emailmember;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getAdditionalname1() {
        return additionalname1;
    }

    public void setAdditionalname1(String additionalname1) {
        this.additionalname1 = additionalname1;
    }

    public String getAdditionalname2() {
        return additionalname2;
    }

    public void setAdditionalname2(String additionalname2) {
        this.additionalname2 = additionalname2;
    }

    public String getEmailmember() {
        return emailmember;
    }

    public void setEmailmember(String emailmember) {
        this.emailmember = emailmember;
    }
}
