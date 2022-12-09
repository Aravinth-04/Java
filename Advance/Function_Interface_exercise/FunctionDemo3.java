package com.functionInterface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class FunctionDemo3 {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Aravinth", 40000));
		emps.add(new Employee("Miss", 41000));
		emps.add(new Employee("ram", 19000));
		emps.add(new Employee("raki", 19000));
		//Using predicate and Function who the employee salary less than 2000k add 3000k
		ArrayList<Employee> copyArray = new ArrayList<>();
		Predicate<Employee> p = s -> s.salary < 20000;
		Function<Employee,Employee> f= s-> {s.salary=s.salary+3000;
											return s;
										   };
		for(Employee emp:emps) {
			if(p.test(emp)) {
			
				copyArray.add(f.apply(emp));
			}
		}
		System.out.println(emps);
	    System.out.println(copyArray);
					
	}

}
