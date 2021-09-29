package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/test")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/")
    public String version(){ return "API Engine 0.1"; }
}
