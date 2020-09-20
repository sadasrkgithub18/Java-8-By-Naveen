package com.naveen.six;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept 
{

	public static void main(String[] args) 
	{
	   // https://devdocs.io/openjdk~8/java/util/function/predicate
		
		Predicate<Integer> func = x -> x > 5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> colList = list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(colList);
		
		
		// Predicate with &&:
		List<Integer> colList2 = list.stream().filter(x->x>5 && x<10).collect(Collectors.toList());
		
		System.out.println(colList2);
		
		
		// Predicate with negate()
		
		List<String> namesList = Arrays.asList("Naveen", "Navee","Nave","Java","Jav", "Ja", "J");
		Predicate<String> namesExp = x-> x.startsWith("Nav");
		
		List<String> newNamesList =namesList.stream().filter(namesExp.negate()).collect(Collectors.toList());
		System.out.println(newNamesList);
		
		
	}

}
