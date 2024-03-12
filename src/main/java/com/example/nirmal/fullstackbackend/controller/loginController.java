package com.example.nirmal.fullstackbackend.controller;
import com.example.nirmal.fullstackbackend.model.loginfo;
import com.example.nirmal.fullstackbackend.repository.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("http://localhost:5173")
public class loginController{


        @Autowired
        private loginRepository loginRepository;

        @PostMapping("/postlogin")
        loginfo newloginfo(@RequestBody loginfo newloginfo){
            return loginRepository.save(newloginfo);
        }
        @GetMapping("/getlogin")
        List<loginfo> getAllloginfo(){
            return loginRepository.findAll();
        }
    }


