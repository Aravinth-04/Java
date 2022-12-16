package com.BiFunctionInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;
class Employee{
	String name;
	int empno;
	double dailywages;
	public Employee(String name, int empno, double dailywages) {
		this.name = name;
		this.empno = empno;
		this.dailywages = dailywages;
	}	
}
class Timesheet{
  int empno;
  int days;
public Timesheet(int empno, int days) {
	this.empno = empno;
	this.days = days;
}
  
}
public class BiFunctionInterfaceDemo {

	public static void main(String[] args) {
		// Example -1
		BiFunction<Integer, Integer, Integer> f= (a,b)->a*b;
		System.out.println(f.apply(3,5));
		// Example -2 Student and timesheet to find wages in employee
		
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee("Aravinth",001,1500));
		emps.add(new Employee("ram",002,1000));
		emps.add(new Employee("Ravi",003,500));
		
		ArrayList<Timesheet> timesheets=new ArrayList<>();
		timesheets.add(new Timesheet(001,25));
		timesheets.add(new Timesheet(003,20));
		timesheets.add(new Timesheet(002,25));
		
		
		BiFunction<Employee,Timesheet,Double> f1= (e,t)->e.dailywages*t.days;
		
		for(Employee emp:emps)
		{
			for(Timesheet timesheet:timesheets)
			{
				if((emp.empno==timesheet.empno))
				{
				System.out.println("employee name "+emp.name+" "+f1.apply(emp, timesheet));
				}
			}
		}	
	}
}
