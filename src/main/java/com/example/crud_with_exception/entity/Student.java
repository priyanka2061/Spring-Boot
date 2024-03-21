package com.example.crud_with_exception.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name="StudentTable")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="rollnumber")
    long rollNumber;
    @Column(name="firstName")
    String firstName;
    @Column(name="lastname")
    String lastName;
    @Column(name="age")
    int age;
    @Column(name="email_id")
     String email_id;
    @Column(name="phoneNumber")
     long phoneNumber;
 @Column(name="address")
     String address;
 @Column(name="registerTimeDate")
     LocalDateTime registerTimeDate=LocalDateTime.of(2020,4,14,8,30,2);
     @Column(name="dateofBirth")
    LocalDate dateOfBirth=LocalDate.of(2003,4,3);
}
