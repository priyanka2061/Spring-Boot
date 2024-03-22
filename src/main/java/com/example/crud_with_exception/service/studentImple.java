package com.example.crud_with_exception.service;

import com.example.crud_with_exception.doa.Studentdoa;
import com.example.crud_with_exception.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class studentImple  implements StudentInterface{
    Studentdoa studentdoa;
    @Autowired
    studentImple(  Studentdoa studentdoa)
    {
        this.studentdoa=studentdoa;
    }
    @Override
    public Student addStudent(Student student) {
       return studentdoa.save(student);
    }

    @Override
    public Optional<Student> findStudentbyId(int id) {


        return  studentdoa.findById(id);
    }

    @Override
    public void deleteStudentById(int id) {
      studentdoa.deleteById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentdoa.save(student);
    }
    public List<Student>getall()
    {
        return studentdoa.findAll();
    }
}
