package com.BiFunctionInterface;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Student1 {
	int rollno;
	String name;

	public Student1(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class BiConsumerDemo {

	public static void main(String[] args) {
		//Example -1
		BiConsumer<String ,String> c=(a,e)->System.out.println(a+e);
		c.accept("ram", "kumar");
		
		//Example -2
		ArrayList<Student1> students= new ArrayList<Student1>();
		
		BiFunction<Integer, String, Student1> bf=(rollno,name)-> new Student1(rollno, name);
		
		students.add(bf.apply(001, "Aravinth"));
		students.add(bf.apply(002, "Miss"));
		students.add(bf.apply(003, "RamKumar"));
		
		BiConsumer<Student1,Integer> dc=(s,e)->s.rollno= s.rollno+e; 
		
		for(Student1 student:students) {
		dc.accept(student, 10);
		}
		for(Student1 student:students) {
			System.out.println(student.name);
			System.out.println(student.rollno);
			}
	}
}

