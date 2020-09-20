package com.naveen.seleniumwithjava8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxWithStream 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		   
		
		List<WebElement> checkBoxList = driver.findElements(By.cssSelector("td.select-checkbox"));
		//checkBoxList.stream().forEach(ele -> ele.click());
		
		checkBoxList.forEach(ele -> ele.click());
	}

}
