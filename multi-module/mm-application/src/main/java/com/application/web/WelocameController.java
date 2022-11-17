package com.application.web;


import lombok.Value;
import org.springframework.web.bind.annotation.*;


public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

}
