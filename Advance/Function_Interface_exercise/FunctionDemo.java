package com.functionInterface;

import java.util.function.Function;

public class FunctionDemo{

	public static void main(String[] args) {
		//find string length
		Function<String,Integer> f = s->s.length();
		System.out.println(f.apply("Aravinth"));
		
		//remove all space
		Function<String,String> f1= s-> s.replaceAll(" ","");
		System.out.println(f1.apply("you have much to learn"));
		
		//find length of the spaces inside in the string 
		Function<String,Integer> f2=s-> s.length()-  s.replaceAll(" ","").length();
		System.out.println(f2.apply("you have much to learn"));
		
		//find the length without spaces
		Function<String,Integer> f3=s->s.replaceAll(" ","").length();
		System.out.println(f3.apply("You have much to learn"));
	}

}
