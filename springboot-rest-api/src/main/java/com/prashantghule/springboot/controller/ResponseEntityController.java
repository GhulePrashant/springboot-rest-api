package com.prashantghule.springboot.controller;

import com.prashantghule.springboot.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ResponseEntity represents the whole HTTP response: status code, headers, and body.
 * As a result, we can use it to fully configure the HTTP response.
 * If we want to use it, we have to return it from the endpoint; Spring takes care of the rest.
 * ResponseEntity is a generic type. Consequently, we can use any type as the response body.
 */

@RestController
public class ResponseEntityController {

    @GetMapping("restudent") //restudent - ResponseEntity Student
    public ResponseEntity<Student> getStudent(){
        Student studentObj = new Student(1, "Prashant", "Ghule");

//        return new ResponseEntity<>(studentObj, HttpStatus.OK);

//        return ResponseEntity.ok(studentObj);

        return ResponseEntity.ok()
                .header("custom-header", studentObj.getFirstName())
                .body(studentObj);
    }

//    We can use this ResponseEntity class for all our RestAPIs developed earlier.
}
