package com.naveen.six;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept 
{

	public static void main(String[] args)
	{
	   // https://devdocs.io/openjdk~8/java/util/function/binaryoperator
		
		BinaryOperator<Integer> func = (x1,x2) -> x1+x2;
		
		int t = func.apply(10,20);
		
		System.out.println("Sum using BinaryOperator is:"+t);
		
		// BiFunction Interface:
		
        BiFunction<Integer, Integer, Integer> func2 = (x1,x2) -> x1+x2;
		
		int t1 = func2.apply(50,40);
		
		System.out.println("Sum using BiFunction is:"+t1);
		
	}

}
