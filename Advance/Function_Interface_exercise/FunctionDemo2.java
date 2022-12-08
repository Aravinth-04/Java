package com.functionInterface;

import java.util.ArrayList;
import java.util.function.Function;

class Employee
{
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
}
public class FunctionDemo2 {

	public static void main(String[] args) {
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(new Employee("Aravinth",40000));
		emps.add(new Employee("Miss",41000));
		emps.add(new Employee("ram",23000));
		//dispaly total employee salary
		Function<ArrayList<Employee>,Double> f = s->{
			double total=0;
			for(Employee x:s)
			{
				total=total+x.salary;
			}
			return total;
		};
       System.out.println(f.apply(emps));
		
		
	}

}
