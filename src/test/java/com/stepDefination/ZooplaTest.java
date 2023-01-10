package com.stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ZooplaTest {
	WebDriver driver;
	@Given("Open the browser")
	public void open_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    System.out.println("StepDef in: open the browser ");
	   
	}

	@Given("go to the application URL")
	public void go_to_the_application_URL() {
		  driver.navigate().to("");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
	   
	}

	@When("Click on signin  button")
	public void click_on_signin_button() {
	   
	   
	}

	@When("put user name")
	public void put_user_name() {
	   
	    
	}

	@When("put user password")
	public void put_user_password() {
	   
	 
	}

	@When("user click on sign in button")
	public void user_click_on_sign_in_button() {
	   
	   
	}

	@Then("user able see log out")
	public void user_able_see_log_out() {
	   
	   
	}


}
