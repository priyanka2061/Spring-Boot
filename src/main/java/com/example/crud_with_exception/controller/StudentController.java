package com.example.crud_with_exception.controller;

import com.example.crud_with_exception.entity.Student;
import com.example.crud_with_exception.service.StudentInterface;
import com.example.crud_with_exception.service.studentImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentInterface studentInterface;

    StudentController(StudentInterface studentInterface) {
        this.studentInterface = studentInterface;
    }

    //add
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentInterface.addStudent(student);
    }

    // update
    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return studentInterface.updateStudent(student);
    }

    //get
    @GetMapping("/student")
    public List<Student> getall() {
        return studentInterface.getall();
    }

    //get all
    @GetMapping("/student/{id}")
    Optional<Student> findStudentbyId( @PathVariable  long id) {
        return studentInterface.findStudentbyId(id);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable long id) {
        studentInterface.deleteStudentById(id);
    }
}




