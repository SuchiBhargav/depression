package com.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @RequestMapping ("/welcome")
    public String welcome(){
        String text ="this is home page";
        text+= "this page not allow to unauthenticated user:";
        return "<h1>" + text + "</h1>";
    }
}
