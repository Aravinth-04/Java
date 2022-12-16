package com.BiFunctionInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student{
	String name;
	int rollno;
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
}
public class BiFunctionInterfaceDemo1 {

	public static void main(String[] args) {
	ArrayList<Student> students=new ArrayList<>();
	
	BiFunction<String,Integer,Student> f=(name,rollno)-> new Student(name,rollno);
	students.add(f.apply("Aravinth", 001));
	students.add(f.apply("ram",002));
	
	System.out.println(students);
	}
}
