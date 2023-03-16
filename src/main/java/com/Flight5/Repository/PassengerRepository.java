package com.Flight5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight5.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
