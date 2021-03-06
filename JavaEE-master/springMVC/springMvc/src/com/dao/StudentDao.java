package com.dao;

import com.model.Student;

import java.util.List;

public interface StudentDao {

    boolean addStudent(String name, String password);
    Student getStudent(String name);
    List<Student> getAllStudents();

}
