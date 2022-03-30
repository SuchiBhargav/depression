package com.jwt.controller;

import com.jwt.helper.JwtUtil;
import com.jwt.model.JwtRequest;
import com.jwt.model.JwtResponse;
import com.jwt.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
public class JwtController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        System.out.println("api mapping correct");
       try{
           this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));

       }
       catch(UsernameNotFoundException e)
        {
           e.printStackTrace();
           throw new Exception("Bad Credentials");

        }catch(BadCredentialsException e)
       {
           e.printStackTrace();
           throw new Exception("Bad Credentials");
       }
       ///if password correct we hv to generate token
        System.out.println("works till here");
        UserDetails userDetails=this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
        System.out.println("user details" + userDetails);
       String token=this.jwtUtil.generateToken(userDetails);
       System.out.println("JWT"+token);

       //{"token":"value"}
        //it convert token in json format
        return ResponseEntity.ok(new JwtResponse(token));


    }
}
