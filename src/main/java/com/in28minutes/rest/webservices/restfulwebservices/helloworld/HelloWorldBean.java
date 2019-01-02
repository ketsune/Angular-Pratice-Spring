package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

/**
 * HelloWorldBean
 */
public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String string){
        this.message = string;
    }

    /**
     * @return the message 
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString(){
        return String.format("HelloWorldBean [message=%s ]", message);
    }
}