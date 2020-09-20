package com.naveen.lambda;

public class LambdaConcept 
{
	public static void main(String[] args)
	{
		
	WebPage web = new WebPage() 
	{
		@Override
		public void header(String value) 
		{
			System.out.println("Hii "+value);
		}
	};
	
	
	WebPage web2 = new WebPage() 
	{
		@Override
		public void header(String value) 
		{
			System.out.println("Hello "+value);
		}
	};
	
	System.out.println("===============================");
	WebPage web3 = (String val) ->{System.out.println("Welcome to " +val);};
	
	WebPage web4 = (val) ->{System.out.println("Welcome to " +val);};
	
	WebPage web5 = (val) ->{System.out.println("Welcome to " +val.toUpperCase());
	                        System.out.println("Welcome to " +val.toLowerCase());};
	
	WebPage web6 = (var) -> {System.out.println("Length is: " +var.length());
	                        System.out.println("Length is: " +var.length());};
	
	 web.header("Google");
	 web2.header("Facebook");
	 web3.header("Amazon");
	 web4.header("Oracle");
	 web5.header("Microsoft");
	 web6.header("Apple");
	}
}
