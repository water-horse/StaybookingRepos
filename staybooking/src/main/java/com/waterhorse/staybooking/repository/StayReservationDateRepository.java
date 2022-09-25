package com.waterhorse.staybooking.repository;

import com.waterhorse.staybooking.model.StayReservedDate;
import com.waterhorse.staybooking.model.StayReservedDateKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface StayReservationDateRepository extends JpaRepository<StayReservedDate, StayReservedDateKey> {
    @Query(value = "SELECT srd.id.stayId FROM StayReservedDate srd WHERE srd.id.stayId IN ?1 AND srd.id.date BETWEEN ?2 AND ?3 GROUP BY srd.id.stayId")
    Set<Long> findByIdInAndDateBetween(List<Long> stayIds, LocalDate startDate, LocalDate endDate);
}
