package com.naveen.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceConcept 
{

	public static void main(String[] args) 
	{
	  // https://devdocs.io/openjdk~8/java/util/function/consumer
		
		Consumer<String> func = x-> System.out.println(x);
		func.accept("This is naveen here!!!!!!!!!!!");
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list.forEach(x -> System.out.println(x));
	}

}
