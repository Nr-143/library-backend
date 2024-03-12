package com.example.nirmal.fullstackbackend.controller;

import com.example.nirmal.fullstackbackend.model.User;
import com.example.nirmal.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/post")
    public User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
    @GetMapping("/post/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

    @GetMapping("/get")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
@PutMapping("/post/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable Long  id) {
        try {
            Long userId = Long.parseLong(String.valueOf(id));
            return userRepository.findById(userId).map(user -> {
                user.setBook_name(newUser.getBook_name());
                user.setAuthor_name(newUser.getAuthor_name());
                user.setBook_code(newUser.getBook_code());
                user.setDate(newUser.getDate());
                user.setDate2(newUser.getDate2());
                user.setStudent_name(newUser.getStudent_name());
                user.setReg_no(newUser.getReg_no());
                user.setDepartment(newUser.getDepartment());
                user.setMobile_no(newUser.getMobile_no());
                return userRepository.save(user);
            }).orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid user id: " + id);
        }
    }

    @DeleteMapping("/post/{id}")
    public String deleteUser(@PathVariable String id) {
        try {
            Long userId = Long.parseLong(id);
            if (!userRepository.existsById(userId)) {
                throw new UserNotFoundException("User not found with id: " + userId);
            }
            userRepository.deleteById(userId);
            return "User with id " + userId + " has been deleted";
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid user id: " + id);
        }
    }
}
