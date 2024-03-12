package com.example.nirmal.fullstackbackend.repository;

import com.example.nirmal.fullstackbackend.model.BookReturn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface returnRepository extends JpaRepository<BookReturn,Long> {
}
