package com.example.geoguessr.controller;

import com.example.geoguessr.model.ImageLocation;
import com.example.geoguessr.repository.ImageLocationRepository;
import com.example.geoguessr.service.ImageLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class ImageLocationController {

    @Autowired
    private ImageLocationRepository imageLocationRepository;

    @GetMapping("/random")
    public ResponseEntity<ImageLocation> getRandomImage() {
        // Retrieve a random image
        ImageLocation randomImage = imageLocationRepository.findRandomImage();

        if (randomImage == null) {
            // Return 404 if no images are found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        // Return the random image
        return ResponseEntity.ok(randomImage);
    }

    @GetMapping("/test") // Just to see if spring is working
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("API is working!");
    }
}