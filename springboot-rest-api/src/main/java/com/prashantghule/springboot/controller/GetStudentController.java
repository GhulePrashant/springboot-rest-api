package com.prashantghule.springboot.controller;

import com.prashantghule.springboot.bean.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple SpringBoot RestAPI which return Java bean as JSON
 * HTTP GET Request using @GetMapping annotation
 */

// If our project has same base url multiple times written in @GetMapping / @PostMapping / @PutMapping,
// we can write @RequestMapping("baseURL") onto class level. Then no need to write on method annotation again.
@RestController
@RequestMapping("student")
public class GetStudentController {

//    http://localhost:8080/student
//    @GetMapping("student")
    @GetMapping
    public Student getStudent(){
        Student studentObj = new Student(1, "Prashant", "Ghule");

        return studentObj;

//        return new Student(1, "Alternative", "Way");
    }

/**
 * This RestAPI will return list of students in JSON format
  */

//  http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Prashant", "Ghule"));
        students.add(new Student(2, "Snehal", "Bangar"));
        students.add(new Student(3, "Shubham", "Gopalghare"));
        students.add(new Student(4, "Sumit", "Gopalghare"));

        return students;
    }

/**
 * SpringBoot RestAPI with Path Variable
 * {id} = URI Template Variable
 * @PathVariable - annotation is used on a method argument to bind it to the value of a URI Template Variable
 * http://localhost:8080/student/1
  */

// If we don't have the method argument variable and URI Template variable same names, then we need to use
// @PathVariable("id")
//    @GetMapping("student/{id}")
    @GetMapping("{id}")
    public Student getStudentWithPathVariable(@PathVariable int id){
        return new Student(id, "Prashant", "Ghule");
    }

//  with multiple PathVariables
//  http://localhost:8080/student/1/Prashant/Ghule
    @GetMapping("{id}/{first-name}/{last-name}")
    public Student getStudentWithMultiplePathVariable(@PathVariable("id") int studentId,
                                                      @PathVariable("first-name") String firstName,
                                                      @PathVariable("last-name") String lastName){
        return new Student(studentId, firstName, lastName);
    }

/**
 *  SpringBoot RestAPI with Request Param
 *  @RequestParam annotation enables spring to extract input data
 *  that may be passed as a query, form data, or any arbitrary custom data.
  */
// http://localhost:8080/student/query?id=1

    @GetMapping("query")
    public Student getStudentWithRequestParam(@RequestParam int id){
        return new Student(id, "Prashant", "Ghule");
    }

//    http://localhost:8080/student/multiplequery?id=1&firstName=Prashant&lastName=Ghule
    @GetMapping("multiplequery")
    public Student getStudentWithMultipleRequestParam(@RequestParam int studentId,
                                                      @RequestParam String firstName,
                                                      @RequestParam String lastName){
        return new Student(studentId, firstName, lastName);
    }
}
