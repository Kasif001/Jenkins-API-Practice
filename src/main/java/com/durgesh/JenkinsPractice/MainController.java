package com.durgesh.JenkinsPractice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/homePage")
    public String get(){
        return "Welcome To The Home Page";
    }
}
