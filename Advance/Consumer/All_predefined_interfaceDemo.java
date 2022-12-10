package com.consumerInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
    double marks;
	public Student(String name, double marks) {
		this.name = name;
		this.marks = marks;
	}
    
}
public class All_predefined_interfaceDemo {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("Aravinth",99));
		students.add(new Student("ram",33));
		students.add(new Student("Miss",79));
		//Display student who get above 60 and shows grade
		Predicate<Student> p= s->s.marks>=60;
		
		Function<Student, String> f= s-> {
			if(s.marks>=80)
			{
				return "A Grade";
			}
			else if(s.marks>=60)
			{
				return "B Grade";
			}
			else if(s.marks>=40)
			{
				return "C Grade";
			}
			else
			{
				return "Fail";
			}
		};
		Consumer<Student> c= s-> {
			System.out.println("Student name: "+s.name);
			System.out.println(f.apply(s));
		};
		for(Student student:students)
		{
			if(p.test(student))
			{
				c.accept(student);
			}
		}
	}	
}
