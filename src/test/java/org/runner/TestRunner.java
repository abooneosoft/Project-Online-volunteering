package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Feature/EventPageFrontend.feature" }, glue = {
"org.steps" }, dryRun = false, monochrome = true, 
		plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","html:C:\\Users\\user\\Desktop\\XLSXfiles\\Demo.html"})
public class TestRunner {

}
//"json:target/cucumber.json",
//"html:C:\\Users\\user\\Desktop\\XLSXfiles\\Demo.html"

 

