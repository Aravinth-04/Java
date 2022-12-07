import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1 {
	String name;
	int age;
	String Designation;
	double salary;

	public Employee1(String name, int age, String designation, double salary) {
		super();
		this.name = name;
		this.age = age;
		Designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		String s = String.format("%s,%d,%s,%.2f", name, age, Designation, salary);
		return s;
	}

}

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee1> a = new ArrayList<>();
		a.add(new Employee1("ram", 22, "Manager", 22000));
		a.add(new Employee1("raki", 22, "developer", 19000));
		a.add(new Employee1("revi", 21, "Manager", 19000));
		a.add(new Employee1("ramya", 19, "Tester", 22000));

//	Employee1[] a= {new Employee1("ram",22,"Manager",22000),
//			   new Employee1("raki",22,"developer",19000)};
		// display employee designation manager
		System.out.println("-------manager--------");
		Predicate<Employee1> p = emp -> emp.Designation.equals("Manager");
		display(p, a);
		// display employee age above 20
		System.out.println("-----age below 20------");
		Predicate<Employee1> p1 = emp -> emp.age < 20;
		display(p1, a);
		// display employee salary below 20000
		System.out.println("------slary below 20000-------");
		Predicate<Employee1> p2 = emp -> emp.salary < 20000;
		display(p2, a);

//    display manager and salary below 20000
		System.out.println("-----Manager and below 20000---------");
		display(p.and(p2), a);

//   all employees who are not manager
		System.out.println("-------employees who are not manager------");
		display(p.negate(), a);
	}

	public static void display(Predicate<Employee1> p, ArrayList<Employee1> a) {
		for (Employee1 e : a)
			if (p.test(e))
				System.out.println(e);
	}
}
