package com.peoject.API.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody // used to send the response to front end
@RestController //combination of two annotation @Controller+ @ResponseBody

@RequestMapping("/sample/api")

public class SampleController {
    @GetMapping("/demo1")
    public String getDemo(){
        System.out.println("This is our first sample API");
        return "This is our first sample API";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        System.out.println("This is our second sample API");
        return "This is our second sample API";
    }
}