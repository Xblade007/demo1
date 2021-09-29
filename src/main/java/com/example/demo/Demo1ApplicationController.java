package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class Demo1ApplicationController
{
    @RequestMapping
    public String Demo1Application()
    {
        return "Welcome to Java Application Spring Boot";
    }
}