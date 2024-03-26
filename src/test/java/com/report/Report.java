package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report extends BaseClass {
	
	public static void generateReport(String jsonFile) throws FileNotFoundException, IOException  {
		File file=new File(System.getProperty("user.dir")+getValueFromPropertyFile("jvmPath"));
		Configuration configuration=new Configuration(file,"Adcatin Hotel");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("BrowserVersion","123");
		configuration.addClassifications("OS", "Windows10");
		configuration.addClassifications("Environment","UAT");
		List<String> list=new ArrayList<String>();
		list.add(jsonFile);
		ReportBuilder reportBulider=new ReportBuilder(list,configuration);
		reportBulider.generateReports();
	}

}
