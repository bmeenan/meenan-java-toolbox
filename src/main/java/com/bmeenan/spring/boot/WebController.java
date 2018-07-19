package com.bmeenan.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/")
    public String index() {
        return "Welcome to Meenan's Java Toolbox!";
    }
    
}
