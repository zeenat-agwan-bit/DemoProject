package com.zee.dao;

import java.util.List;

import com.zee.domain.Student;

public interface StudentDAO {
	public void saveStudent(Student student);

	public Student getStudentById(Long id);

	public List<Student> getStudentByDate(String date);
	
	
	
	public List searchData(Student student);
	
	
}
