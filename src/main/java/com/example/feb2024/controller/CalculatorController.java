package com.example.feb2024.controller;

import com.example.feb2024.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {
    //CalculatorService cs=new CalculatorService();

    @Autowired //Dependency injection-indecting a dependency which is needed by class
    CalculatorService cs;
    /*
    @GetMapping("/divide/{first}/{second}")
    public double divide(@PathVariable("first") double first,
                         @PathVariable("second") double second){
        return cs.divide(first,second);

    }*/
    @GetMapping("/divide/{first}/{second}")
    public ResponseEntity<Object> divide(@PathVariable("first") double first,
                                 @PathVariable("second") double second){
        if(second==0){
            return new ResponseEntity<>("Second input is zero,division is not possible", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(cs.divide(first,second),HttpStatus.OK);

    }
}
