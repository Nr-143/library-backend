package com.example.nirmal.fullstackbackend.controller;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String id) {
        super("could not found id "+id);
    }
}
