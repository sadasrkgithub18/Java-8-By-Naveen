package com.naveen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodRef 
{

	public static void main(String[] args) 
	{
	  List<String> names = Arrays.asList("Java","C#","PHP","Pthon");
	  
	  System.out.println("============With Anonymous class===================");
		
	  
	  //1. With Anonymous class
	  names.forEach(new Consumer<String>() 
	  {

		@Override
		public void accept(String var) 
		{
			System.out.println(var);
		}
		  
	  });
	  
	  System.out.println("=============Using Lambda Exp: ->==================");
		
	  //2. Using Lambda Exp: ->
	  names.forEach(str -> System.out.println(str));
	  
	  System.out.println("===============Using Method References================");
		
	  //3. Using Method References:
	  names.forEach(System.out::println);
	  
	  
	  System.out.println("===============Using for Loop================");
		
	  //4. Using for Loop
	  for(int i =0; i<names.size(); i++)
	  {
		  System.out.println(names.get(i));
	  }
	  
	  System.out.println("===============Using for-each loop================");
		
	  //5. Using for-each loop
	  for(String str : names)
	  {
		  System.out.println(str);
	  }
	  
	  
	}

}
