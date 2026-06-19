package com.std.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.main.entities.Student;
import com.std.main.repositories.StdRepository;
import com.std.main.services.StdService;


@Service
public class StdServiceImpl implements StdService
{

	@Autowired
	StdRepository stdRepository;
	
	@Override
	public List<Student> getAllStudents() 
	{
		List<Student> list = stdRepository.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) 
	{
		return stdRepository.save(student);
	}

	@Override
	public Student getById(int id) 
	{
		
		return stdRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
         stdRepository.deleteById(id);		
	}

}
