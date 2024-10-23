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

    // I was going to make the randomImage getter method here using java and whatnot
    // But after I found out I could just use SQL in the repository class, this was
    // a much more convoluted way of doing what I do there in 1 SQL line

    // public ImageLocation getRandomImage() {
    //     List<ImageLocation> allImages = repository.findAll();
    //     return allImages.get(new Random().nextInt(allImages.size()));
    // }

    // Leave this, come back if I can't do it in frontend
    public boolean verifyGuess(UUID imageId, String guessedCountry) {
        return true;
    }
}
