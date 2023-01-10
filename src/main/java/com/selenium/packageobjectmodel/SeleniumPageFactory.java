package com.selenium.packageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.util.Constant;
//@=annotation=simliar like java method
public class SeleniumPageFactory {
	WebDriver driver;
	SeleniumPageFactory(WebDriver driver){
	this.driver=driver;	
	}
	
	@FindBy(xpath="//*[@name='username']")
     private  WebElement username; 
	@FindBy(xpath="//*[@name='password']")
	  private WebElement password;
	@FindBy(xpath="//*[@name='submit']")
	  private WebElement submit;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	  
	  
	  
		
	

	}
