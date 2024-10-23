package com.example.geoguessr.model;

import java.util.UUID;
import jakarta.persistence.*;

@Entity
@Table(name = "location_images")
public class ImageLocation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String image_url;

    @Column(nullable = false)
    private String country;

    // No-argument constructor required by JPA
    public ImageLocation() {
    }

    public ImageLocation(String image_url, String country) {
        this.image_url = image_url;
        this.country = country;
    }

    // Getters and setters for id, imageUrl, and country

    // Getter for id
    public UUID getId() {
        return id;
    }

    // Setter for id
    public void setId(UUID id) {
        this.id = id;
    }

    // Getter for imageUrl
    public String getImageUrl() {
        return image_url;
    }

    // Setter for imageUrl
    public void setImageUrl(String image_url) {
        this.image_url = image_url;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Setter for country
    public void setCountry(String country) {
        this.country = country;
    }
}
