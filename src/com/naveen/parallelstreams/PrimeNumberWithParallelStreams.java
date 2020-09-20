package com.naveen.parallelstreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStreams 
{

	public static void main(String[] args) 
	{
	  // System.out.println(isPrime(13));
		long t1,t2;
		
		t1= System.currentTimeMillis();
		
		long count = Stream.iterate(0, n -> n+1)
		      .limit(1000000)
		      .parallel()
		      .filter(PrimeNumberWithParallelStreams :: isPrime)
		      .peek(x -> System.out.println(x))
		      .count();
		
		System.out.println("Total prime numbers are:" +count);
		
		t2 = System.currentTimeMillis();
		
		System.out.println("Total time taken is:" +(t2-t1)/1000);
		
	}
	
	public static boolean isPrime(int number)
	{
		if(number<=1) 
			return false;
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x == 0);
		
	}

}
