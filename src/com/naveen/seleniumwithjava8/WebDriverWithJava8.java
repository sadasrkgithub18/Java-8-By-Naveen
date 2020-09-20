package com.naveen.seleniumwithjava8;


import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWithJava8 
{

	public static void main(String[] args) 
	{
	  // WebDriverManager.chromedriver().setup();
	   System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   
	   driver.get("https://www.amazon.in");
	   
	   List<WebElement> linksList =  driver.findElements(By.tagName("a"));
	   System.out.println(linksList.size());
	   
	   
	  /* for (WebElement webElement : linksList) 
	   {
		   System.out.println(webElement.getText());  
	   }*/
	   
	   
	   //1. Way of iterating
	  // linksList.forEach(ele -> System.out.println(ele.getText()));
	   
	   
	   //2. Way of iterating
	  /* List<String> collList  = linksList.stream()
	                                      .filter(ele -> !ele.getText().equals(""))
	                                      .map(ele -> ele.getText())
	                                      .collect(Collectors.toList());
	  */          
	 // 1 way to print  
	    //collList.forEach(ele -> System.out.println(ele));        
	 // 2 way to print  
	    //collList.forEach(System.out::println);  
	   
	   //3.
	   
	  /* String firstText =  linksList.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
	   System.out.println("First text is: "+firstText);
	  */  
	   
	   //4.
	   
	   /*String findAny = linksList.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
	   System.out.println("Using findAny(): "+findAny);
	   */
	   
	   //5. Excludes blank text and starts with amazon
	   List<String> collect = linksList.stream()
	            .filter(ele -> !ele.getText().equals("") && ele.getText().startsWith("Amazon"))
	            .map(ele -> ele.getText())
	            .collect(Collectors.toList());
	   
	   collect.forEach(System.out::println);
	   
	   
	 //6. Excludes blank text and contains with amazon
	   /*List<String> collect2 = linksList.stream()
	            .filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon"))
	            .map(ele -> ele.getText())
	            .collect(Collectors.toList());
	   
	   collect2.forEach(System.out::println);
	   */
	   
	  //7. using filter() multiple times  
	 /* List<String> allLinksText =  linksList.stream()
	            .filter(ele -> !ele.getText().isEmpty())
	            .filter(ele -> !ele.getText().startsWith(" "))
	            .map(ele -> ele.getText().trim())
	            .collect(Collectors.toList());
	            
	  allLinksText.forEach(System.out::println);
	 */ 
	   driver.quit();
	}

}
