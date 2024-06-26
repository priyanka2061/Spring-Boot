package com.example.crud_with_exception.service;

import com.example.crud_with_exception.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface  {

    Student addStudent(Student student);
   Optional< Student> findStudentbyId(int id);
    void deleteStudentById(int id);
    Student updateStudent(Student student);
    List<Student> getall();


}
