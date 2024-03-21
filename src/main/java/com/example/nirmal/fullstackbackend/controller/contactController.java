package com.example.nirmal.fullstackbackend.controller;

import com.example.nirmal.fullstackbackend.model.Contact;
import com.example.nirmal.fullstackbackend.model.loginfo;
import com.example.nirmal.fullstackbackend.repository.contactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class contactController {

    @Autowired
    private contactRepository contactRepository;

    @PostMapping("/postcontact")
    Contact newcontact(@RequestBody Contact newcontact){
        return contactRepository.save(newcontact);
    }
    @GetMapping("/getcontact")
    List<Contact> getAllcontact(){
        return contactRepository.findAll();
    }
}
