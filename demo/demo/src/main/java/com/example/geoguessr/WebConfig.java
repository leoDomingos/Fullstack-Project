package com.example.geoguessr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // This right here is apparently required to let the backend be accessed by the frontend
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/random")                                  // Endpoint in question
                .allowedOrigins("http://localhost:3000")                     // Frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")   // Allowed HTTP methods
                .allowedHeaders("*")            // Boilerplate stuff (?)
                .allowCredentials(true);  //
    }
}

