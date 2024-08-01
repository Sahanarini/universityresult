package com.ani.restapp.service;

import java.util.List;

import com.ani.restapp.model.Student;

public interface StudentService {

	public String addStudent(Student student);

	public Student getStudent(int id);

	public List<Student> getAllStudents();

	public String updateStudent(Student student);

	public String deleteStudent(int id);

}
