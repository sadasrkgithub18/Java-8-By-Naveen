package com.naveen.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFilterFindAnyOrElse 
{

	public static void main(String[] args) 
	{
	  
		List<Customer> customerList = Arrays.asList(
				                         new Customer("Tom" ,23),
				                         new Customer("Peter" ,27),
				                         new Customer("James" ,34),
				                         new Customer("Roy" ,45)); 
		
		// 1. Filter with FindAny()
		Customer customer = customerList.stream().filter(x -> "James".equals(x.getName())).findAny().orElse(null);
		System.out.println(customer.getName()+ " "+customer.getAge());
		
		System.out.println("==============================");
		
		//2. Filter - did not find any or Else
		Customer customer1 = customerList.stream().filter(x -> "SRK".equals(x.getName())).findAny().orElse(null);
		System.out.println(customer1);

		System.out.println("==============================");
		
		
		//3. Filter with multiple conditions
		Customer customer2 = customerList.stream().filter(x -> "Roy".equals(x.getName()) && 45 == x.getAge()).findAny().orElse(null);
		System.out.println(customer2.getName()+ " "+customer2.getAge());
	}

}
