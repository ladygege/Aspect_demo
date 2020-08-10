package com.example.aspect_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/user")
    @ResponseBody
    public void sayHello(String name) {
        System.out.println("hello"+name);
    }

}
