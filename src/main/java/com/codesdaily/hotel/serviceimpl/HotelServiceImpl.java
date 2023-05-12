package com.codesdaily.hotel.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.codesdaily.hotel.entity.Hotel;
import com.codesdaily.hotel.exceptions.ResourceNotFound;
import com.codesdaily.hotel.repo.HotelRepo;
import com.codesdaily.hotel.service.HotelService;
@Service
public class HotelServiceImpl implements HotelService{

	
	@Autowired HotelRepo hotelRepo;
	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) throws ResourceNotFound {
		// TODO Auto-generated method stub
		return hotelRepo.findById(hotelId).orElseThrow(()->new ResourceNotFound("No resource found with Id"+hotelId));
	}

}
