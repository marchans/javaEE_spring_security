package com.marchans.springsecurity.data.dao;

import java.util.List;

import com.marchans.springsecurity.data.entities.Student;

public interface StudentsDao {

Student addStudent(Student student);
Student getStudentById(int studentId);
List<Student> getAllStudents();
Student getStudentByPIB(String pib);
List<Student> getAllStudentsByCourse(int course);
void saveStudent(Student student);

}

