package com.naveen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithFilterCollect 
{

	public static void main(String[] args) 
	{
	
		List<String> productList = Arrays.asList("Mac Book","iPhone","Shoes","Battery","Charger");
		
		System.out.println(productList);
		productList.forEach(ele -> System.out.println(ele));
		
		System.out.println("==============================");
		
		List<String> prodResult = productList.stream().filter(ele -> !ele.equals("Shoes")).collect(Collectors.toList());
		prodResult.forEach(ele -> System.out.println(ele));
		
		System.out.println("==============================");
		prodResult.forEach(System.out::println);
		
	}

}
