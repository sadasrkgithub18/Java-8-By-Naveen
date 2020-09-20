package com.naveen.seleniumwithjava8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesWithStream 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\64bitAutomationSW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		String title = switchToWindowTest(driver, "PopupTest Friday");
		System.out.println(title);
		
		driver.quit();
		
	}
	
	public static String switchToWindowTest(WebDriver driver, String title)
	{
		return driver.getWindowHandles()
		      .stream()
		      .map(handler -> driver.switchTo().window(handler).getTitle())
		      .filter(ele -> ele.contains(title))
		      .findFirst()
		      .orElseThrow(() -> {throw new RuntimeException("No Such Window");
		      });
	}

}
