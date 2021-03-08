package com.jvmbootcamp.restapi1.om.jvmbootcamp.restapi1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    //    localhost:8080/firstApplication
    @GetMapping(path="/firstApplication")
    public String printRestAPI(){
        return "Welcome to SPRING BOOT";
    }

//localhost:8080/firstApplication/path-variable/akankshatyagi
    @GetMapping(path="/firstApplication/path-variable/{name}")
    public String printPathVariable(@PathVariable String name){
        return "my name is : "+name;
    }
}
