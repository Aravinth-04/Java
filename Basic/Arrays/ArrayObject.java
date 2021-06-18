import java.util.*;

public class ObjectArray {
    String name;
    long emp_no;
    ObjectArray(String name,long emp_no)       //instead of using method putData function
	{
		this.name=name;
		this.emp_no=emp_no;
		
	}
    private ObjectArray getData()       // container name is classname
	{
		System.out.println("name "+ name);
		System.out.println("emp_no "+ emp_no);
		return null;
		
	}
//    @Override                           //toString method to print  object easily
//	public String toString()
//	{ 
//		return name+ " "+emp_no;
//	}
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no arrayObject : ");
		int n=sc.nextInt();
		
		ObjectArray o[]=new ObjectArray[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter your name : ");
		String name=sc.next();
		System.out.println("Enter your employee_no: ");
		long emp_no=sc.nextLong();
			o[i]=new ObjectArray(name,emp_no);
//			o[i].putData(name,emp_no);
		}
		for(int i=0;i<n;i++)
		{
			o[i].getData();
			System.out.println( );
	}
//      System.out.println(Arrays.toString(o));
	}
	
	

}