package com.naveen.seleniumwithjava8;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksWithStream 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freshworks.com");
		
		//1. Way
		List<WebElement> footerList = driver.findElements(By.cssSelector("ul.footer-nav li"));
		List<String> newFooterList = new ArrayList<String>();
		footerList.stream().forEach(ele -> newFooterList.add(ele.getText()));
		newFooterList.forEach(System.out::println);
		
		System.out.println("====================================");
		
		//2. Way
		List<String> newFooterList2 = new ArrayList<String>();
		driver.findElements(By.cssSelector("ul.footer-nav li")).stream().forEach(ele -> newFooterList2.add(ele.getText()));
		newFooterList2.forEach(System.out::println);
		
		
	}

}
