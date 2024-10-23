package com.example.geoguessr.service;

import com.example.geoguessr.model.ImageLocation;
import com.example.geoguessr.repository.ImageLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class ImageLocationService {

    @Autowired
    private ImageLocationRepository repository;

    // public ImageLocation getRandomImage() {
    //     List<ImageLocation> allImages = repository.findAll();
    //     return allImages.get(new Random().nextInt(allImages.size()));
    // }

    public boolean verifyGuess(UUID imageId, String guessedCountry) {
        ImageLocation image = repository.findById(imageId).orElse(null);
        return image != null && image.getCountry().equalsIgnoreCase(guessedCountry);
    }
}
