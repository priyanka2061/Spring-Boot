package com.example.crud_with_exception.doa;

import com.example.crud_with_exception.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentdoa extends JpaRepository<Student, Long> {

}
