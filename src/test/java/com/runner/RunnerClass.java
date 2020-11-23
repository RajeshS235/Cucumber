package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\Flipkart.feature"},
glue={"com.stepdefinitions"}, monochrome=true)
public class RunnerClass {	
	
}
	