package com.Flight5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight5.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
