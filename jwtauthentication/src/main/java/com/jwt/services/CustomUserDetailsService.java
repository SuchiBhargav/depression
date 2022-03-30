package com.jwt.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService
{

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //creating fake service now but here we hv to pass db newarray list for what security access it hv to user

        if(userName.equals("suchi"))
        {
            return new User("suchi","123",new ArrayList<>());
        }
        else
        {
           throw new UsernameNotFoundException("user not found||");
        }

    }
}
