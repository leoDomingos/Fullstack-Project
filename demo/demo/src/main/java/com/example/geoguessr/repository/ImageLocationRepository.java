package com.example.geoguessr.repository;

import com.example.geoguessr.model.ImageLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImageLocationRepository extends JpaRepository<ImageLocation, UUID> {
    
    // Custom queries can go here if needed
    @Query(value = "SELECT * FROM location_images ORDER BY RANDOM() LIMIT 1", nativeQuery = true)
    ImageLocation findRandomImage();
}
