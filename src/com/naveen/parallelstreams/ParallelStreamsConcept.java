package com.naveen.parallelstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamsConcept 
{

	public static void main(String[] args) 
	{
	  ForkJoinPool corePools = ForkJoinPool.commonPool();
	  System.out.println(corePools.getParallelism()); //3
	  
	  //1. Parallel method on stream
	  //Stream<String> stream = Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon");
	  //BaseStream baseStream = stream.parallel();
	  
	  Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon").forEach(System.out::println);
	  System.out.println("=====================================");
	  Stream.of("Naveen","Tom","Selvin","Peter","Raj","Simon").parallel().forEach(System.out::println);
		 
	  System.out.println("=====================================");
		 
	  
	  //2. Use parallelmethod() on  a collection stream.
	  Arrays.asList("Naveen","Tom","Selvin","Peter","Raj","Simon").parallelStream().forEach(System.out::println);
	 
	  
	  //3. Print 1 to 10
	  System.out.println("===========Sequential Stream==========================");
      IntStream.rangeClosed(1,10).forEach(System.out::println);
	  
	  
	  System.out.println("=============Parallel Stream=======================");
	  IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
	  
	  System.out.println("=====================================");
		
	  //4. Print from a to z --> 97 to 122
	  //System.out.println(getAlphabetsList());
	  System.out.println("===========Sequential Stream==========================");
	  getAlphabetsList().stream().forEach(System.out::println);
	  
	  System.out.println("=============Parallel Stream=======================");
	  getAlphabetsList().stream().parallel().forEach(System.out::println);
	  
	  System.out.println("=====================================");
		
	  //Check stream is running in parallel mode or not? -> isParallel() method
	  IntStream range  =  IntStream.rangeClosed(1, 10);
	  System.out.println(range.isParallel()); //false
	  
	  System.out.println("=====================================");
		
	  IntStream range1  =  IntStream.rangeClosed(1, 10);
	  range1.parallel();
	  System.out.println(range1.isParallel()); // true
	  
	}

	
	public static List<String> getAlphabetsList()
	{
		List<String> alpha = new ArrayList<String>();
		
		int n =97;
		
		while( n<= 122)
		{
			char c = (char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		
		return alpha;
	}
	
	
}
