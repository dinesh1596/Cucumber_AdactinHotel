package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.*;

public class HooksClass extends BaseClass {
	
	//which are blocks of code that run before or after each scenario 
	//@Before-> it executes before each scenario (Ex: starting a webdriver, staring a DB Connection)
	//@After-> it executes after each scenario (Ex: Browser close, Closing of DB Connection)
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getValueFromPropertyFile("browser"));
		lanuchURL(getValueFromPropertyFile("url"));
		windowMaximize();
	}
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			scenario.attach(screenshot(), "images/png", "each after scenario");
		}
		else {
		scenario.attach(screenshot(), "images/png", "each after scenario");
		}
		quit();
	}

}
