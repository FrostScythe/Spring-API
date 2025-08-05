package com.peoject.API.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/api")

public class SimpleController {
    @GetMapping("/demo1")
    public String getDemo(){
        System.out.println("This is our first simple API");
        return "This is our first simple API";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        System.out.println("This is our second simple API");
        return "This is our second simple API";
    }
}