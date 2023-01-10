package com.oops.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCode {
	
	
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[ @class='login']")).click();
	driver.findElement(By.xpath("//*[ @id='email']")).click();
	driver.findElement(By.xpath("//*[ @id='email']")).sendKeys("sadaf144@hotmail.com");
	driver.findElement(By.xpath("//*[ @name='passwd']")).click();
	driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("password");
    driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
}
}
