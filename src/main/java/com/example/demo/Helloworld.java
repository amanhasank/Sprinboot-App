package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Helloworld {

    @GetMapping(path = "/hello")
    public String getMethodName() {
        return "hello ifchidjhfjvhdjfhvjkfdhvjkfdvhjfhvjfdvhjkdfhoduchs";
    }
    
    @GetMapping(path = "/cool")
    public String cool() {
        return "ohhhhhhh yeahhhhh";
    }
    

}