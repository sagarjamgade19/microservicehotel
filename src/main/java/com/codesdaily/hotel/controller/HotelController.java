package com.codesdaily.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesdaily.hotel.entity.Hotel;
import com.codesdaily.hotel.exceptions.ResourceNotFound;
import com.codesdaily.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired 
	private HotelService hotelService;
	@PostMapping("/create")
 public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
	 
	 return ResponseEntity.status(HttpStatus.CREATED).body( hotelService.createHotel(hotel));
 }
	@GetMapping("/{hotelId}")
	public  ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) throws ResourceNotFound{
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
	}
	@GetMapping("/allHotels")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		return ResponseEntity.ok(this.hotelService.getAllHotels());
		
	}
}
