package com.user.controller;

import com.user.services.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userid}")
    public User getUser(@PathVariable("userid") Long userid)
    {
        User user = (User) this.userService.getUser(userid);
        return user;
       // List doctors = this.restTemplate.getForObject(url:"http://localhost:9002/")
    }





}
