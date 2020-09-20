package com.naveen.six;

import java.util.function.Function;

public class FunctionInterfaceConcept 
{

	public static void main(String[] args) 
	{
	
		// https://devdocs.io/openjdk~8/java/util/function/function
		
		Function<String, Integer> func = x -> x.length();
		
		int len = func.apply("This is Java 8 and using with Selenium WebDriver");
		System.out.println("Length is:"+len);
		
		
		// Chaining Function
		Function<Integer, Integer> func2= x -> x*2;
		
		int result = func.andThen(func2).apply("This is SRK here");
		
		System.out.println(result);
		
		
	}

}
