import java.util.function.Predicate;

class Employee
{
	String name;
	int age;
	boolean isHavingGF;
	public Employee(String name, int age, boolean isHavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + "]";
	}
	
}
public class Pub {
 public static void main(String[] args) {
	 Employee[] emps= { new Employee("Aravinth",22,false),
					  new Employee("ram",21,true),
					  new Employee("malar",33,true)};
	 Predicate<Employee> p=emp->emp.isHavingGF==true && emp.age>18;
	 
	 for(Employee x:emps)
	 {
		 if(p.test(x))
			 System.out.println(x);
	 }
	}
}

