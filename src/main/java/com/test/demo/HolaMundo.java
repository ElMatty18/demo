package com.test.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    @RequestMapping("/")
    public String Hola() {
        return "Hola Mundo";
    }
}
