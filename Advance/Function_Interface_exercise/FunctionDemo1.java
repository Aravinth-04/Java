package com.functionInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
}
public class FunctionDemo1 {

	public static void main(String[] args) {
	ArrayList<Student> std=new ArrayList<>();
	std.add(new Student("Aravinth",90));
	std.add(new Student("kumar",39));
	std.add(new Student("issac newton",45));
	
	
	Function<Student,String> f=s->{
		int marks=s.marks;
		if(s.marks>70)
		{
		  return "A grade";
		}
		else if(s.marks>60)
		{
			return "B grade";
		}
		else if(s.marks>=40)
		{
			return "c grade";
		}
		else 
		{
			return "Fail";
		}			
	};
	for(Student l:std)
	{
	System.out.println(l.name);
    System.out.println(f.apply(l));
	}
}
}
