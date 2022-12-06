import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		int a[]= {5,10,0,22,1,18};
		Predicate<Integer> p1= i->i>10;
		Predicate<Integer> p2= i-> i%2==0;
		m1(p1,a);
		m1(p2,a);
		m1(p1.negate(),a);
		m1(p1.and(p2),a);
		m1(p1.or(p2),a);
		System.out.println(p1.getClass());
		System.out.println(p1.toString());
	}

	public static void m1(Predicate<Integer> p, int[] a) {
		for(int x1:a)
		{
			if(p.test(x1))
				System.out.println(x1);
		}
	}

}
