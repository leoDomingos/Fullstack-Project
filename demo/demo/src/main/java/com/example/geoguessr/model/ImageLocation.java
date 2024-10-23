package com.example.geoguessr.model;

import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name = "location_images") // This is the table our data will be saved at
public class ImageLocation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // No need to reference it while inserting Anki Cards in SQL
    private UUID id;

    @Column(nullable = false)
    private String image_url;

    @Column(nullable = false)
    private String country;

    // No-argument constructor required by JPA (why?)
    public ImageLocation() {
    }

    // Proper constructor
    public ImageLocation(String image_url, String country) {
        this.image_url = image_url;
        this.country = country;
    }

    // Getters and setters for id, imageUrl, and country
    // Tutorial said this was good practice

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getImageUrl() {
        return image_url;
    }

    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
