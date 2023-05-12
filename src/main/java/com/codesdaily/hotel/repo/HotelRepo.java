package com.codesdaily.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codesdaily.hotel.entity.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, String>{

}
