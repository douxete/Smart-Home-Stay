package com.vnc.smarthomestay.repository;

import com.vnc.smarthomestay.entity.ReservationRequest;
import com.vnc.smarthomestay.service.BillTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationRequest, String> {
    @Query(value = "SELECT a.emailMember, CASE WHEN a.additionalName1 IS NOT NULL AND a.additionalName2 IS NOT NULL THEN b.price+c.additionalPrice+d.additionalPrice WHEN a.additionalName1 IS NOT NULL THEN b.price+c.additionalPrice ELSE b.price END AS price FROM transaction AS a INNER JOIN homestay_rooms AS b ON a.roomNumber=b.roomNumber LEFT JOIN homestay_additional AS c ON c.additionalName=a.additionalName1 LEFT JOIN homestay_additional AS d ON d.additionalName=a.additionalName2 order by a.id desc limit 1", nativeQuery = true)
    List<BillTotal> sendBill();
}
