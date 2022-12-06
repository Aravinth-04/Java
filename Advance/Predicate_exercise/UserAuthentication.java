import java.util.Scanner;
import java.util.function.Predicate;

class User
{
	String username;
	String password;
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
}

public class UserAuthentication {

	public static void main(String[] args) {
		Predicate<User> p=u ->u.username.equals("durga") && u.password.equals("a123");
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		String password=sc.nextLine();
		User allow=new User(username,password);
	    if(p.test(allow)) {
	    	System.out.println("you are valid");
	    }
	    else {
	    	System.out.println("you are not valid");
	    }

	}

}
