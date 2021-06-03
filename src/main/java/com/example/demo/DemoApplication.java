package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@Configuration
public class DemoApplication {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello ys！";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}