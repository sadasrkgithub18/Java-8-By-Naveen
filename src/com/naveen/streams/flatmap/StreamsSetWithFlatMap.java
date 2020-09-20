package com.naveen.streams.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap 
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		
		emp1.setName("SRK");
		
		emp1.addDevices("iPhone 9");
		emp1.addDevices("Samsung 9");
		emp1.addDevices("Mac Book Air");
		emp1.addDevices("Realme");
		
		
        Employee emp2 = new Employee();
		
        emp2.setName("Tom");
		
        emp2.addDevices("Windows");
        emp2.addDevices("Samsung 9");
        emp2.addDevices("Mac Book Pro");
        emp2.addDevices("Android");

		
		List<Employee> empLists = new ArrayList<Employee>();
		
		empLists.add(emp1);
		empLists.add(emp2);
		
		
		List<String> devicesList = empLists.stream()
		                 .map(x -> x.getDevices())// Stream<Set<String>>
		                 .flatMap(x -> x.stream()) // Stream<String>
		                 .distinct()
		                 .collect(Collectors.toList());
		
		devicesList.forEach(x -> System.out.println(x));
	}

}
