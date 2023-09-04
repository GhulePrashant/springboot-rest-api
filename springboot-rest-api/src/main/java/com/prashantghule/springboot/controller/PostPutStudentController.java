package com.prashantghule.springboot.controller;

import com.prashantghule.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * SpringBoot RestAPI for HTTP POST Request using @PostMapping & @RequestBody annotations
 */

@RestController
public class PostPutStudentController {

// @PostMapping annotation is used to map HTTP POST Request - Create new resource

// @RequestBody annotation is responsible for retrieving the HTTP request body and automatically converting it to the Java object
// @RequestBody internally uses Spring provided HttpMessageConverter to convert JSON into Java Object

//    http://localhost:8080/student/create

// @ResponseStatus annotation is used to send status code for requests.
    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
// In real-time project we save these details in DB and then return.
        return student;
    }

/**
 * SpringBoot RestAPI to handle HTTP PUT Request - Update existing resource
  */

    @PutMapping("student/{id}/update")
    public Student updateStudent(@PathVariable("id") int studentId,@RequestBody Student student){
        return student;
    }

/**
 * SpringBoot RestAPI to handle HTTP DELETE Request - Delete existing resource
 */

    @DeleteMapping("student/{id}/delete")
    public String deleteStudent(@PathVariable("id") int studentId){
        return "Student deleted successfully! "+ studentId;
    }
}
