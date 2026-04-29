package com.example.restApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    //Mapping the function with the get mapping annotation
    @GetMapping("/health-check")
    public String healthCheck(){
        return "Ok";
    }
}
