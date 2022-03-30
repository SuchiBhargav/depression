package com.email.controller;

import com.email.model.EmailRequest;
import com.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;
    
    @RequestMapping("/welcome")
    public String welcome()
    {
        return "hello";
    }


    //api to sent email
    @RequestMapping(value="/sentmail",method= RequestMethod.POST)
    public ResponseEntity<?> sentEmail(@RequestBody EmailRequest request)
    {
        System.out.println(request);
        boolean result= this.emailService.sendEmail(request.getSubject(), request.getMessage(), request.getTo());
        if(result)
            return ResponseEntity.ok("Email Successfully sent");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent");

    }
}
