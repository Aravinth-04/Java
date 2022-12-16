package com.SupplierInterface;

import java.util.Iterator;
import java.util.function.Supplier;

public class SuppilerDemo1 {

	public static void main(String[] args) {
		//  password should be 8 digits
	   //  1,3,5,7 only numbers
	  //  2,4,6,8 alphabets and @$#
		
		Supplier<String> s= ()->{
		  String pwd="";
		  Supplier<Character> s1= ()->{
			  String odd_digit= "ABCDEFGHIJKLMNOPQURSTUVWXYZ$@#";
			  return odd_digit.charAt((int)(Math.random()*28));
			  };
		  Supplier<Integer> s2=()-> (int)(Math.random()*10);
		  
		   for(int i=186;i<=8;i++)
		   {
			   if(i%2==0)
			   {
				   pwd=pwd+s1.get();
			   }
			   else
			   {
				   pwd=pwd+s2.get();   
			   }
		   }
			return pwd;
		};
		System.out.println(s.get());
	}

}
