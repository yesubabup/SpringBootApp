package com.spring.boot.mvc.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.mvc.dao.StudentDao;
import com.spring.boot.mvc.entity.Student;

@Service
public class StudentService {
	
@Autowired
private StudentDao studentDao;	

	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
		
	}
	
	public Student getStudentById(int id){
		return studentDao.getStudentById(id);
	}
	public Student deleteStudentById(int id){
		return this.studentDao.deleteStudentById(id);		
	}
	
	public Student addStudent(Student student){
		return this.studentDao.addStudent(student);
	}
	
	public Student updateStudent(Student student,int id){
		return this.studentDao.updateStudent(student,id);
	}
	
	

}
