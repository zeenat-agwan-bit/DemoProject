package com.zee.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zee.domain.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(student);
		tr.commit();
		session.close();
	}

	public Student getStudentById(Long id) {
		Session session = sessionFactory.openSession();
		Student stud = session.get(Student.class, id);
		return stud;
	}

	public List<Student> getStudentByDate(String date) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date bookingdate = null;
		try {
			bookingdate = (Date) df.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Student.class);
		Criterion crt1 = Restrictions.eq("date", bookingdate);
		cr.add(crt1);
		List<Student> students = cr.list();
		session.close();
		return students;
	}

	public List searchData(Student student) {
		List li = new ArrayList();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		List list = session.createQuery("from Student").list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Student stud = (Student) it.next();
			if (student.getId() == (stud.getId())
					|| (student.getName().equals(stud.getName()) || (student.getCourse().equals(stud.getCourse())
							|| (student.getTime().equals(stud.getTime()) || student.getType().equals(stud.getType())
									|| student.getGender().equals(stud.getGender()))))) {
				Student obj = new Student();
				obj.setId(stud.getId());
				obj.setName(stud.getName());
				obj.setCourse(stud.getCourse());
				obj.setTime(stud.getTime());
				obj.setType(stud.getType());
				obj.setGender(stud.getGender());
				li.add(obj);
			}
		}
		return li;
	}

}
