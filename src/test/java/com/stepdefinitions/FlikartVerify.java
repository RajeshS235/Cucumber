package com.stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlikartVerify extends BaseClass {

	WebDriver driver;
	
	@Given("launching frontier browser")
	public void launching_frontier_browser() {
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.flyfrontier.com/");
	}

	@When("entered the source and destinations")
	public void entered_the_source_and_destinations() {
driver.findElement(By.id("kendoDepartFrom_input")).click();
		
		WebElement allCountry = driver.findElement(By.id("kendoDepartFrom_listbox"));
		
		List<WebElement> countries = allCountry.findElements(By.tagName("li"));
		for (WebElement selectYourCountry : countries) {
			
			String text = selectYourCountry.getText();
			
			if(text.equalsIgnoreCase("Albuquerque")) {
				selectYourCountry.click();
			}
		}
		
		WebElement toCountry = driver.findElement(By.id("kendoArrivalTo_input"));
		
		toCountry.click();
		
		WebElement des = driver.findElement(By.id("kendoArrivalTo_listbox"));
		
		List<WebElement> destinations = des.findElements(By.tagName("li"));
		
		for (WebElement all : destinations) {
			
			String text = all.getText();

			if(text.equalsIgnoreCase("Cincinnati")) {
				all.click();
				
			}
		}
	}

	@When("click login button")
	public void click_login_button() {
	}

	@Then("verify link is live")
	public void verify_link_is_live() {
	}

	
}
