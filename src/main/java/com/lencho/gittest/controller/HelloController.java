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

    @GetMapping("/helloGit")
    public String helloGit(){
        return "hello git";
    }

    public String helloJava(){ return "hello java";}

    public String helloScala(){return "hello scala";}

    public String helloSpark(){ return "hello spark!!!";}

}
