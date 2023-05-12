package com.codesdaily.hotel.service;

import java.util.List;

import com.codesdaily.hotel.entity.Hotel;
import com.codesdaily.hotel.exceptions.ResourceNotFound;

public interface HotelService {

	Hotel createHotel(Hotel hotel);
	List<Hotel> getAllHotels();
	Hotel getHotel(String hotelId) throws ResourceNotFound;
}
