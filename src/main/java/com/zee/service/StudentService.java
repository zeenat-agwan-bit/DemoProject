package com.zee.service;

import java.util.List;

import com.zee.domain.Student;

public interface StudentService {
	public void addStudent(Student student);

	public Student searchStudentById(Long id);
	public List<Student> searchStudentsByDate(String date);
	public List findData(Student student);
		
}
