package com.example.bookingsystem.models;

import java.util.List;

public class Course {
    private Long id ;
    private String name ;
    private String town ;
    private int starRating;


    //one to many
    private List<Booking> bookings;

    //one to many
    private List<Customer> customer;
}
