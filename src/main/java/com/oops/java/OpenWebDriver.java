package com.oops.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebDriver {

	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//step 2
		driver.get("http://automationpractice.com/index.php");
		//Step 3 ==> user name
		driver.findElement(By.className("login")).click();//click sign in btn
		driver.findElement(By.id("email")).click();//click email
		driver.findElement(By.id("email")).sendKeys("sadaf144@gmail.com");// write my email
		// step 4==> password
		driver.findElement(By.name("passwd")).click();
		driver.findElement(By.name("Submittlogin")).click();
		
		
        
        
        
        
        
        
        
        
        
        
	}
}
