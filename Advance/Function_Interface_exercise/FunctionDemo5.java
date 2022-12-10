package com.functionInterface;

import java.util.function.Function;

public class FunctionDemo5 {

	public static void main(String[] args) {
		String username="aravinth A";
		String password="@123";
		
		Function<String,String> f1=s->s.toLowerCase();
		Function<String,String> f2=s->s.substring(0,4);
		if(f1.andThen(f2).apply(username).equals("arav")&& password.equals("@123"))
		{
			System.out.println("you are valid");
		}
		else
		{
			System.out.println("you are not Valid");
		}

	}

}
