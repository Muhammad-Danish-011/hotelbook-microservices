package com.hotelbook.hotelbook.modal;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="hotel")
public class Hotel {
 @Id
 
 private long id ;
    private String thumbnail;
    private String name ;
    private String Description;
    private String experienceLevel;
    private long price;
   

}
