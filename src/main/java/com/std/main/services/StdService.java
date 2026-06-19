package com.std.main.services;

import java.util.List;

import com.std.main.entities.Student;

public interface StdService
{
		public List<Student> getAllStudents();
		
		public Student saveStudent(Student student);
		
		public Student getById(int id);
		
		public void deleteById(int id);
}
