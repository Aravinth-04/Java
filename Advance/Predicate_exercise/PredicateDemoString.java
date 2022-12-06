import java.util.function.Predicate;

public class PredicateDemoString {

	public static void main(String[] args) {
		// program to display names start with 'k' by using predicate
		
		String names[]= {"sunny","","raki","karan"};
		Predicate<String> p= i->i.charAt(0)=='k';
		
			
	     m1(p,names);
	}

	public static void m1(Predicate<String> p, String[] names) {
		
		for(String x:names)
		{
			if(p.test(x))
			  System.out.println(x); 
		}
	}
}
