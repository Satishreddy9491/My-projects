package com.javatpoint.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
    public String home(){
        return "home.jsp";
    }
}
