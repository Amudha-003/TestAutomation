package com.TestRunnerFile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeatureFile\\Blaze.feature",
glue = "com.StepDefinitionFile", 
plugin = "html:ReportFolder/htmlReport1.html")
public class TestRunner extends BaseClass1 {

	@BeforeClass
	public static void Setup() {
		browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
