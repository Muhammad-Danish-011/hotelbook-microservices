package com.hotelbook.hotelbook.repositary;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbook.hotelbook.modal.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Long >{


    
}



