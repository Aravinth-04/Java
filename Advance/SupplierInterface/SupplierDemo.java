package com.SupplierInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		//  EX-1 current date and time now
		Supplier<Date> s=()-> new Date();
		System.out.println(s.get());

		// EX-2 Random String print
		Supplier<String> s1= ()-> {
			String[] values= {"Aravinth","Miss","Ram"};
			 return values[(int)(Math.random()*3)];
		};
	    System.out.println(s1.get());
	    
	    // EX-3 Random OTP with six number
	    
	    Supplier<String> s2= ()->{
	    	String pwd="";
	        //Supplier<Integer> l=()->(int)(Math.random()*10);
	    	for(int i=1;i<=6;i++)
	    	{
	    		pwd=pwd+(int)(Math.random()*10);      //pwd=pwd+l.get();
	    	}
	    	return pwd;
	    };
		 System.out.println(s2.get());
		 
		
	}

}
