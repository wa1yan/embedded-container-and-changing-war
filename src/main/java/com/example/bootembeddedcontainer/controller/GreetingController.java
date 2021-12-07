package com.example.bootembeddedcontainer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String greet(){
        return "Hello from Tomcat Embedded Container";
    }


}
