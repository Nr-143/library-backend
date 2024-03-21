package com.example.nirmal.fullstackbackend.repository;

import com.example.nirmal.fullstackbackend.model.BookReturn;
import com.example.nirmal.fullstackbackend.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface resourceRepository extends JpaRepository<Resource,Long>

    {
}
