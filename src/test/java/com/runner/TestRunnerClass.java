package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

@CucumberOptions(tags="",dryRun= false, features="src\\test\\resources\\features", glue="com.stepdefinition",

publish= false,monochrome= true, plugin= {"pretty","json:target//Output.json", "rerun:target/failed_scenarios.txt"},snippets=SnippetType.CAMELCASE )

public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Report.generateReport(System.getProperty("user.dir")+getValueFromPropertyFile("jsonPath"));
		
	}

}
