package com.example.crud_with_exception.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="roll_number")
     int  rollNumber;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;
    @Column(name="age")
    int age;
    @Column(name="email_id")
     String email_id;
    @Column(name="phone_number")
     int phoneNumber;
 @Column(name="address")
     String address;
 @Column(name="register_time_date")
     LocalDateTime registerTimeDate;

}
