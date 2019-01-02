package com.in28minutes.rest.webservices.restfulwebservices.basic.auth;


/**
 * HelloWorldBean
 */
public class AuthenticationBean {

    public AuthenticationBean() {
    }

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    private String message;

    
    
    @Override
    public String toString(){
        return String.format("HelloWorldBean [message=%s ]", message);
    }
}