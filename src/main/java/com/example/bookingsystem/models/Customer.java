package com.example.bookingsystem.models;

import java.util.List;

public class Customer {
    private Long id ;
    private String name ;
    private String town ;
    private int age ;

    //one to many
    private List<Booking> bookings;

    private Customer customer;
}
