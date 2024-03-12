package com.example.nirmal.fullstackbackend.repository;
import com.example.nirmal.fullstackbackend.model.loginfo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface loginRepository extends JpaRepository<loginfo,Long> { 
}
