package com.stepdefinitions;


import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {

	WebDriver driver;
	
@Before
public void before() {
	browserLaunch();

}
@After
public void browserClose() {
	System.out.println("Browser close");
	close();

}

	
	
}
