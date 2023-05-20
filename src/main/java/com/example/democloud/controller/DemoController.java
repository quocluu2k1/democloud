package com.example.democloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @GetMapping("/message")
    public String demoString(){
        return "Hello world!!!";
    }

//     @GetMapping("/{id}")
//     public String getProductDetail(@PathVariable(value = "id") String id){
//         return "Hello "+id;
//     }
}
