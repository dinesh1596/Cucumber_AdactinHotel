package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "json:target\\Output.json"}, glue="com.stepdefinition", features="@target/failed_scenarios.txt")

public class FailRunnerClass extends BaseClass{
	
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Report.generateReport(System.getProperty("user.dir")+getValueFromPropertyFile("jsonPath"));
	}

}
