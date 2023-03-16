 package com.Flight5.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight5.Entity.Flight;
import com.Flight5.Repository.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findflights(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("departureDate")@DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate) {
	List<Flight> findFlights = flightRepo.findtheFlights(from,to,departureDate);
		System.out.println(findFlights);
		return" ";
	}
	

}
