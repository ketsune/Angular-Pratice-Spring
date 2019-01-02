package com.in28minutes.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorldController
 */
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    @GetMapping(path="/basicauth")
    public AuthenticationBean helloWorldBean(){
        
        // Error e = new Error("Error Variable");
        //throw new RuntimeErrorException(e,"Some Error has Happened! Contact support at ****");
        return new AuthenticationBean("You Are Authenticated");
    }
}