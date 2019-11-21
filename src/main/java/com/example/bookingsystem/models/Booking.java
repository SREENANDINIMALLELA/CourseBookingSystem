package com.example.bookingsystem.models;

import java.util.List;

public class Booking {
    private Long id ;
    private String date ;
    // one to one
    private Course  course;
    //one to one
    private Customer customer;
}
