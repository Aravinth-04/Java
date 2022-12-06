import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemoString1 {

	public static void main(String[] args) {
		// To remove null values and Empty String
		
		String[] names= {"ram","ravi","",null,"kumar"};
		Predicate<String> p=i-> i!=null && i.length()!=0;
		
		ArrayList<String> copyarray=new ArrayList<>();
		m1(p,names,copyarray);
		System.out.println(copyarray);
	}

	public static void m1(Predicate<String> p, String[] names,ArrayList<String> copyarray) {
		for(String name:names)
		{
			if(p.test(name))
				copyarray.add(name);
		}
		
	}

}
