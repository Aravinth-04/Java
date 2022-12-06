import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1{
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
		String s=String.format("%s,%d,%s,%.2f",name,age,Designation,salary);
		return s;
	}
	
}

public class EmployeeTest {
public static void main(String[] args) {
	ArrayList<Employee1> a= new ArrayList<>();
	a.add(new Employee1("ram",22,"Manager",22000));
	a.add(new Employee1("raki",22,"developer",19000));
	
//	Employee1[] a= {new Employee1("ram",22,"Manager",22000),
//				   new Employee1("raki",22,"developer",19000)};
	Predicate<Employee1> p= emp->emp.Designation.equals("Manager");
	for(Employee1 x:a)
		if(p.test(x))
			System.out.println(x);
}
}
