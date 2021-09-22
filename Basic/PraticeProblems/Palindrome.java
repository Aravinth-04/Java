
public class Palilndrome                                                                                    //Greekforgreeks
{
	public static void main(String[] args) {
	 int n=5555;
	 int f=n;
	 int rev=0,rem;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==f)
        {
           System.out.println("yes");
        }
        else
        {
        System.out.println("No");    
        }
	}
}
