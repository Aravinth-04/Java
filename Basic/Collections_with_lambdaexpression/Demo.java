package com.Aravinth;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		System.out.println("----List----");
//------------------List------------------------
		// ArrayList -Integer- lambda expression
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(44);
		a.add(3);
		a.add(77);
		a.add(5);
		a.add(99);
		System.out.println(a);
		Collections.sort(a, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
		System.out.println(a);

		// ArrayList -String- lambda expression
		ArrayList<String> b = new ArrayList<>();
		b.add("ravi");
		b.add("ram");
		b.add("mathu");
		b.add("miss");
		b.add("Aravinth");
		b.add("zz");
		System.out.println(b);
		Collections.sort(b, (i1, i2) -> {
			String s1 = (String) i1;
			String s2 = (String) i2;
			int result = s1.compareTo(s2);
			return (result > 0) ? -1 : (result < 0) ? +1 : 0;
		});
		System.out.println(b);

//-----------------set------------------------------
//----------------TreeSet---------------------------	
		System.out.println("----set----");
		TreeSet<Integer> c = new TreeSet<>(); // default it's ascending order
		c.add(23);
		c.add(100);
		c.add(1);
		System.out.println(c);

		TreeSet<Integer> d = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < 12) ? +1 : 0); // customize desc order
																								// using lambda
		d.add(23);
		d.add(100);
		d.add(1);
		System.out.println(d);
//-----------------Map------------------------------
// --------------TreeMap----------------------------
		System.out.println("----Map----");
		TreeMap<Integer, String> e = new TreeMap<>(); // default it's ascending order
		e.put(1, "ram");
		e.put(99, "ravi");
		e.put(0, "miss");
		System.out.println(e);// it's showing key wise ascending order

		TreeMap<Integer, String> f = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0); // customize desc
																										// order using
																										// lambda
		f.put(1, "ram");
		f.put(99, "ravi");
		f.put(0, "miss");
		System.out.println(f);

//---------------Customize class sorting using lambda expression-----------
		System.out.println("-----Customize class sort->lambda-------");
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("ram", 12));
		emp.add(new Employee("ravi", 1));
		emp.add(new Employee("prakesh", 77));
		System.out.println("before sorting" + emp);
		Collections.sort(emp, (i1, i2) -> (i1.no > i2.no) ? -1 : (i1.no < i2.no) ? +1 : 0);// using lambda -customize-descending
		System.out.println("after sorting" + emp);

	}

}

class Employee {
	String ename;
	int no;

	public Employee(String ename, int no) {
		this.ename = ename;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", no=" + no + "]";
	}

}
