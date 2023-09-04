package com.prashantghule.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple SpringBoot RestAPI using @GetMapping
 */

// We use @Controller annotation to make a java class as a Spring MVC controller

// We use @ResponseBody annotation to tell the controller, the object returned is automatically
// serialized into JSON and passed back into the HTTPResponse object.

// @RestController is combination of @Controller and @ResponseBody annotations.

@RestController
public class HelloWorldController {
    // As we are retrieving the data from method this will be HTTP GET Request
    //We use @GetMapping annotation to map HTTP GET request onto specific handler method.

    //http://localhost:8080/hello-world
    //hit this api from browser or postman/soapui
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }
}
