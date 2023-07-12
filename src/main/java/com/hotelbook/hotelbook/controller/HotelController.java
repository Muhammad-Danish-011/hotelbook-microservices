package com.hotelbook.hotelbook.controller;

import com.hotelbook.hotelbook.modal.Hotel;
import com.hotelbook.hotelbook.repositary.HotelRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/hotels")
public class HotelController {

    private final HotelRepo hotelRepository;

    @Autowired
    public HotelController(HotelRepo hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @PostMapping("/add")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        return ResponseEntity.ok(hotels);
    }
    @DeleteMapping("/delete")
public ResponseEntity<String> deleteAllHotels() {
    hotelRepository.deleteAll();
    return ResponseEntity.ok("All hotels deleted successfully.");
}
}
