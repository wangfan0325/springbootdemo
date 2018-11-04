package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wang on 2018/7/23.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "this is a Springboot demo";
    }
}
