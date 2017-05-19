package com.spring.boot.mvc.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.boot.mvc.entity.Student;

@Repository
public class StudentDao {
	
	private static Map<Integer, Student> students;
	
	static {
		
		students = new HashMap<Integer,Student>(){
			{
				put(1,new Student(1,"yesubabu","Java"));
				put(2,new Student(2,"Ram","C"));
				put(3,new Student(3,"Durga","C++"));
			}
			
		};
	}
	
		public Collection<Student> getAllStudents(){
			return this.students.values();		
		}
		
		public Student getStudentById(int id){
			return this.students.get(id);
		}
		public Student deleteStudentById(int id){
			return this.students.remove(id);
		}
		
		public Student addStudent(Student student){
			return this.students.put(students.size()+1,student);
		}
		
		public Student updateStudent(Student student,int id){
			Student s = students.get(id);
			if(s.getId()==id){
				students.put(id, student);
			}
			
			return null;					
		}
		
		

}
