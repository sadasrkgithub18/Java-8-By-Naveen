package com.naveen.sequential;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams 
{

	public static void main(String[] args) 
	{
		System.out.println("=============================");
		
		//1. 
		Stream<String> stream = Stream.of("SRK","Tom","Peter","Selvin");
		
		//stream.forEach(System.out::println); //Stream will be closed if use it once
		stream.findFirst().ifPresent(System.out::println);
		
		System.out.println("=============================");
		
		//2. 
		Arrays.asList("a1","a2","a3")
		       .stream()
		       .findFirst()
		       .ifPresent(System.out::println);
		System.out.println("=============================");
		
		
		//3. Print  1 to 10
		IntStream.range(1,11).forEach(System.out::println);
		
		System.out.println("=============================");
		
		
		//4. 
		Arrays.stream(new int[] {1,2,3,4})
		      // .map(n -> 2 * n + 1)
		       .average()
		       .ifPresent(System.out::println);
		
		System.out.println("=============================");
		
		
		//5. String data Objects
		
		Stream.of("a1","a2","a3","b555")
		           .map(s -> s.substring(1))
		           .mapToInt(Integer::parseInt)
		           .max()
		           .ifPresent(System.out::println);
		
		System.out.println("=============================");
		
		
		//6. Doubles to String Objects
		
		Stream.of(1.0, 2.0, 3.0)
		   .mapToInt(Double :: intValue)
		   .mapToObj(i -> "M" +i)
		   .forEach(System.out::println);
		
		System.out.println("=============================");
		
		
		//7. Limit
		
		Stream.iterate(0, n -> n+1).limit(11).forEach(System.out::println);
		
		System.out.println("=============================");
		
		//8. Odd Numbers
		Stream.iterate(0, n -> n+1).filter(x -> x%2 != 0).limit(10).forEach(System.out::println);
		
		System.out.println("=============================");
	}

}
