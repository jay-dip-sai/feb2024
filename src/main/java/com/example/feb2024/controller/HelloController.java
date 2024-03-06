package com.example.feb2024.controller;

import org.springframework.web.bind.annotation.*;

@RestController//creates an object to hellocontroller class when server is started
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to springboot framework";
    }
    @GetMapping("/greet/{firstname}")
    public String sayHello(@PathVariable("firstname") String firstname){
        return "Hi "+firstname.toUpperCase()+" ,welcome to springboot apllication";
    }
    @GetMapping("/greet/{firstname}/{lastname}")
    public String sayHello(@PathVariable("firstname") String firstname,
                           @PathVariable("lastname") String lastname){
        return "Hi "+firstname.toUpperCase()+" "+lastname.toUpperCase()+",welcome to springboot apllication";
    }
    @GetMapping("/greetwithparams")
    public String sayHelloWithParams(@RequestParam("firstname") String firstname,
                           @RequestParam("lastname") String lastname){
        return "Hi "+firstname.toUpperCase()+" "+lastname.toUpperCase()+",welcome to springboot apllication";
    }
}
