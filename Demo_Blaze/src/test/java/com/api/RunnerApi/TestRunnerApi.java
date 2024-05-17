package com.api.RunnerApi;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\api\\feature\\API.feature", glue = "com.api.stepdef", plugin = "html:ReportFolder/apihtmlReport1.html")
public class TestRunnerApi {

}
