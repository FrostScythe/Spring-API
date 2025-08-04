package com.peoject.API.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/api")

public class DemoController {
    @GetMapping
    public String getDemo(){
        System.out.println("This is our first demo API");
        return "This is our first demo API";
    }
}
