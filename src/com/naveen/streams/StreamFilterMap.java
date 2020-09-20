package com.naveen.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap 
{

	public static void main(String[] args) 
	{
		List<Customer> customerList = Arrays.asList(
                new Customer("Tom" ,23),
                new Customer("Peter" ,27),
                new Customer("James" ,34),
                new Customer("Roy" ,45)); 

		List<Person> personsList = Arrays.asList(
                new Person("Tom" ,23),
                new Person("Peter" ,27),
                new Person("James" ,34),
                new Person("Roy" ,45)); 

		System.out.println("==============================");
		
		String customerName  = customerList.stream().filter(x -> "James".equals(x.getName())).map(Customer::getName).findAny().orElse(null);
		System.out.println("Name from customer list:"+customerName);
		
		System.out.println("==============================");
		
		String namePerson  = personsList.stream().filter(x -> "James".equals(x.getName())).map(Person::getName).findAny().orElse(null);
		System.out.println("Name from persons list:"+namePerson);
		
		System.out.println("==============================");
		
		// Printing all the list
		List<String> custList = customerList.stream().map(Customer::getName).collect(Collectors.toList());
		custList.forEach(System.out::println);
	}

}
