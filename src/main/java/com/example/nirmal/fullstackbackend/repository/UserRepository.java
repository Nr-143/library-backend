package com.example.nirmal.fullstackbackend.repository;

import com.example.nirmal.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

