package com.example.nirmal.fullstackbackend.controller;
import com.example.nirmal.fullstackbackend.model.BookReturn;
import com.example.nirmal.fullstackbackend.repository.returnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class returnController {
    @Autowired
    private returnRepository returnRepository;

    @PostMapping("/postreturn")
    public BookReturn newbookReturn(@RequestBody BookReturn newbookReturn) {
        return returnRepository.save(newbookReturn);
    }

    @GetMapping("/getreturn")
    public List<BookReturn> getAllUsers() {
        return returnRepository.findAll();
    }


}
