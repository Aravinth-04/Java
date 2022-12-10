package com.functionInterface;

import java.util.function.Function;

public class FunctionDemo4 {

	public static void main(String[] args) {
	Function<String, String> f1= s->s.toUpperCase();
	Function<String, String> f2= s->s.substring(0,9);
	System.out.println(f1.andThen(f2).apply("Aravinth A"));
	
	Function<Integer,Integer> f3=s->s+s;
	Function<Integer,Integer> f4=s->s*s;
	System.out.println(f3.andThen(f4).apply(5));  // 100
	System.out.println(f3.compose(f4).apply(5));  // 50
	
	}

}
