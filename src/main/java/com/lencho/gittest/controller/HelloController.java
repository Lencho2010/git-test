package com.lencho.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-07-21 21:55
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello springboot!!!";
    }

}