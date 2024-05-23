package org.steps;

import java.awt.AWTException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateProjectSteps extends BaseClass {


	@Given("user is on the Assign page")
	public void user_is_on_the_assign_page() {
		launchBrowser("gecko");
		loadUrl("https://dev.onlinevolunteering.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@evolunteering.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("sign_in")).click();
		driver.navigate().to("https://dev.onlinevolunteering.com/project/create");
	}
	@When("user can select the continent from the Select Continent")
	public void user_can_select_the_continent_from_the_select_continent() {
		System.out.println("By Manually Verified");
	}
	@When("user can select Countries from the Select Country")
	public void user_can_select_countries_from_the_select_country() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user can select Companies from the Select Companies")
	public void user_can_select_companies_from_the_select_companies() throws AWTException {
	   WebElement element = driver.findElement(By.xpath("//label[text()='Select Company(es)']/parent::div/descendant::span[@class='select2-selection__choice__remove']"));
	   waitForVisibility(element);
	   element.click();
	   WebElement element2 = driver.findElement(By.xpath("//label[text()='Select Company(es)']/parent::div/descendant::ul[@class='select2-selection__rendered']"));
	   element2.click();
	   element2.sendKeys("Employee");
	   key("enter");
	}
	@When("user can select Regions from the Select Regions")
	public void user_can_select_regions_from_the_select_regions() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user can select Site from the Select Sites")
	public void user_can_select_site_from_the_select_sites() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user can select Department from the Select Department\\(s)")
	public void user_can_select_department_from_the_select_department_s() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user can select Team from the Select Team\\(s)")
	public void user_can_select_team_from_the_select_team_s() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user can select User from the Select User\\(s)")
	public void user_can_select_user_from_the_select_user_s() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("user click the Next Step button to navigate to the next module")
	public void user_click_the_next_step_button_to_navigate_to_the_next_module() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
