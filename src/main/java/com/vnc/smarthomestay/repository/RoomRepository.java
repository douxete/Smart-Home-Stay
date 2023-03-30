package com.vnc.smarthomestay.repository;

import com.vnc.smarthomestay.entity.Room;
import com.vnc.smarthomestay.service.BillTotal;
import com.vnc.smarthomestay.service.ShowRoom;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, String> {
    @Query(value = "SELECT roomnumber, roomname, price, status, null as additionalname, 0 as additionalprice FROM homestay_rooms UNION SELECT 0 as roomnumber, null as roomname, 0 as price, null as status, additionalname, additionalprice as additionalprice FROM homestay_additional", nativeQuery = true)
    List<ShowRoom> findAllRooms();

    @Query(value = "INSERT INTO transaction(roomNumber,additionalName1,additionalName2,emailMember) values(:roomnumber, :additionalname1, :additionalname2, :emailMember)", nativeQuery = true)
    public void saveTransaction(int roomnumber, String additionalname1, String additionalname2, String emailMember);


}
