package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.packageobjectmodel.SeleniumPageObjectModel;
import com.util.Constant;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin extends Constant  {
	



public	void login() {
	//Constant constant=new Constant();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//driver.findElement(constant.getUSER()).click();	
	//driver.findElement(pom.getUserName()).sendKeys(Obj.getUsername);
	
	//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(pom.getPassword())));
	//driver.findElement(pom.getPassword()).click();
	
	//driver.findElement(pom.getPassword()).sendKeys(obj.getpassword);
	//driver.findElement(pom.getLogin()).click();
	
	
	//driver.quit();
	}

}
