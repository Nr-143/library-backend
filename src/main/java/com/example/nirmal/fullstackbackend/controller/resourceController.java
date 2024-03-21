package com.example.nirmal.fullstackbackend.controller;
import com.example.nirmal.fullstackbackend.model.BookReturn;
import com.example.nirmal.fullstackbackend.repository.resourceRepository;
import com.example.nirmal.fullstackbackend.model.Resource;
import com.example.nirmal.fullstackbackend.repository.returnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class resourceController {

    @Autowired

    private resourceRepository resourceRepository;

    @PostMapping("/postres")
    public Resource newresource(@RequestBody Resource newresource)
    {
        return resourceRepository.save(newresource);
    }

    @GetMapping("/getres")
    public List<Resource> getAllUsers() {
        return resourceRepository.findAll();
    }
}
