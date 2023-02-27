package com.library.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Library {

    private String libraryName;
    private  String libraryAddress;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int libraryNumber;
    private  String libraryFacilities;

}
