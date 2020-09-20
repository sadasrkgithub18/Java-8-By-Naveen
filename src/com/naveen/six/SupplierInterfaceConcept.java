package com.naveen.six;

import java.util.function.Supplier;

public class SupplierInterfaceConcept 
{

	public static void main(String[] args) 
	{
	  // https://devdocs.io/openjdk~8/java/util/function/supplier
		
		getText(()-> "Java");
		getText(()-> "Ruby");
		getText(()-> "PHP");
	}
	
	public static void getText(Supplier<String> text)
	{
		System.out.println(text.get());
	}

}
