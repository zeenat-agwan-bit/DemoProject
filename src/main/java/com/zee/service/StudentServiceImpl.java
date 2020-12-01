package com.zee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.dao.StudentDAO;
import com.zee.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	public void addStudent(Student student) {
		dao.saveStudent(student);
	}

	public Student searchStudentById(Long id) {

		return dao.getStudentById(id);
	}

	public List<Student> searchStudentsByDate(String date) {
		return dao.getStudentByDate(date);
	}

	public List findData(Student student) {
		// TODO Auto-generated method stub
		return dao.searchData(student);
	}

}
