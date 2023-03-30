package com.vnc.smarthomestay.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.math.BigDecimal;

@Entity
@Table(name = "homestay_rooms")
public class Room {

    @Id
    private int Id;
    private int roomnumber;
    private String roomname;
    private BigDecimal price;
    private String status;

    public Room() {
    }

    public Room(int id, int roomnumber, String roomname, BigDecimal price, String status) {
        Id = id;
        this.roomnumber = roomnumber;
        this.roomname = roomname;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
