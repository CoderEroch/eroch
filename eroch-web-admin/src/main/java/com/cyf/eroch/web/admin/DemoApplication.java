package com.cyf.eroch.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {
    @RequestMapping(value="",method= RequestMethod.GET)
    public String sayHi(){
        return "Hello Eroch";
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

