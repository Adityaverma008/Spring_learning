package com.example.Spring_learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
    @GetMapping()
    public String hello(){
        return "index"; // load index.html file
    }



}
