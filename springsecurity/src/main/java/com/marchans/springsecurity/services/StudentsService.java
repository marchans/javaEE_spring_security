package com.marchans.springsecurity.services;

import java.util.List;

import com.marchans.springsecurity.data.entities.Student;

public interface StudentsService {
Student addStudent(Student student);
Student getStudentById(int studentId);
List<Student> getAllStudents();
Student getStudentByPIB(String pib);
List<Student> getAllStudentsByCourse(int course);
void saveStudent(Student student);
}
