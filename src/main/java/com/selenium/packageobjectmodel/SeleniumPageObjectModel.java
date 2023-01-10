package com.selenium.packageobjectmodel;

import org.openqa.selenium.By;

public class SeleniumPageObjectModel {
	
  private By userName=By.xpath("//*[@name='username']");
  private By password=By.xpath("//*[@name='password']");
  private By login =By.xpath("//*[@type='submit']");
  
  
  
    public By getUserName() {
	return userName;
}
   public By getPassword() {

	return password;
}
    public By getLogin() {
	return login;
}
	

    
    
    
}
