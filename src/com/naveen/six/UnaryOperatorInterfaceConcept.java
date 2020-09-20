package com.naveen.six;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept 
{

	public static void main(String[] args) 
	{
	  // https://devdocs.io/openjdk~8/java/util/function/unaryoperator
		
		UnaryOperator<Integer> func = x-> x*7;
		
		int t1= func.apply(10);
		System.out.println("Sum using UnaryOperator is:"+t1);
		
		
		Function<Integer, Integer> func2= x -> x*10;
		System.out.println("Sum using Function Interface is:"+func2.apply(50));
		
		
		
		List<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Ruby");
		langList.add("PHP");
		
		System.out.println(langList);
		
		langList.replaceAll(ele -> ele + " SRK");
		
		System.out.println(langList);
		
	}

}
