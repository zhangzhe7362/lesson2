package com.zz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    String name;

    @GetMapping("/name")
    public String getName(){
        return this.name;
    }

    @GetMapping("/hello/{id}")
    public String getId(@PathVariable("id") String id){
        return id;
    }
}
