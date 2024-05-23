package org.steps;

import java.awt.AWTException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeamCaptainSteps extends BaseClass {

	public TeamCaptainSteps() {

		PageFactory.initElements(driver, this);

	}
	@Given("user is on the Add New Team")
	public void user_is_on_the_add_new_team() {
		launchBrowser("chrome");
		loadUrl("https://dev.onlinevolunteering.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@evolunteering.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("sign_in")).click();
		driver.navigate().to("https://dev.onlinevolunteering.com/company-teams/team/create");
	}
	@When("user can select the company in SelectCompany")
	public void user_can_select_the_company_in_select_company() throws AWTException {
	    WebElement element = driver.findElement(By.id("select2-company_id-container"));
	    element.click();
	    WebElement element2 = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));
	    waitForVisibility(element2);
	    element2.sendKeys("Employee Volunteering");
	    WebElement element3 = driver.findElement(By.xpath("//li[text()='Employee Volunteering']"));
	    waitForVisibility(element3);
	    key("enter");
	    
	    
	    
	}
	@When("user can enter the team name in TeamName")
	public void user_can_enter_the_team_name_in_team_name() {
	    driver.findElement(By.id("team_name")).sendKeys("Testing");
	    
	}
	@When("user can select the project in SelectProject")
	public void user_can_select_the_project_in_select_project() throws AWTException {
	    driver.findElement(By.id("select2-project_id-container")).click();
	    WebElement element = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));
	    waitForVisibility(element);
	    element.sendKeys("Test for Review");
	    WebElement element2 = driver.findElement(By.xpath("//li[text()='Test for Review']"));
	    waitForVisibility(element2);
	    key("enter");
	}
	@When("user can select the team event in SelectTeamEvent")
	public void user_can_select_the_team_event_in_select_team_event() throws AWTException {
	    driver.findElement(By.id("select2-event_id-container")).click();
	    WebElement element = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));
	    waitForVisibility(element);
	    element.sendKeys("Test AT");
	  
	    WebElement element2 = driver.findElement(By.xpath("//li[text()='Test AT']"));
	    waitForVisibility(element2);
	    key("enter");
	}
	@When("user can switch the status to Active or Inactive in Status")
	public void user_can_switch_the_status_to_active_or_inactive_in_status() {
	    System.out.println("Active Status on Default");
	}
	
	@When("user can select the captain from SelectCaptain")
	public void user_can_select_the_captain_from_select_captain() throws AWTException {


		driver.findElement(By.id("select2-admin_user_id-container")).click();
		 WebElement element = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[2]"));
		    waitForVisibility(element);
		    element.sendKeys("sophie1@hotmail.com");
		    key("enter");
		
	}
	@When("user also can add the captain by InviteCaptain button")
	public void user_also_can_add_the_captain_by_invite_captain_button() {
		for (int i = 1; i < 4; i++) {
			driver.findElement(By.xpath("//button[text()='Add Captain']")).click();
		    		}
		for (int i = 1; i < 4; i++) {
			WebElement element = driver.findElement(By.xpath("(//input[@name='captain_firstname[]'])["+i+"]"));
		    waitForVisibility(element);
		    element.sendKeys("Automation");
		    driver.findElement(By.xpath("(//input[@name='captain_lastname[]'])["+i+"]")).sendKeys("Tester");
		    driver.findElement(By.xpath("(//input[@name='captain_email[]'])["+i+"]")).sendKeys("test@mail.com");
		}
		
		for (int i = 1; i < 3; i++) {
			WebElement element = driver.findElement(By.xpath("(//button[text()='Remove'])["+i+"]"));
			waitForVisibility(element);
			element.click();
			}
	    	    
	}
	@When("user can select the user from SelectUsers")
	public void user_can_select_the_user_from_select_users() throws AWTException {
			 WebElement element = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		   waitForVisibility(element);
		   element.click();
		   element.sendKeys("Autotest User");
		   key("enter");
	}
	@When("user also can add the users by InviteUsers button")
	public void user_also_can_add_the_users_by_invite_users_button() {
	  
			driver.findElement(By.xpath("//button[text()='Add User']")).click();
		    		
		
			WebElement element = driver.findElement(By.xpath("//input[@name='user_firstname[]']"));
		    waitForVisibility(element);
		    element.sendKeys("Automation");
		    driver.findElement(By.xpath("//input[@name='user_lastname[]']")).sendKeys("Tester");
		    driver.findElement(By.xpath("//input[@name='user_email[]']")).sendKeys("test@mail.com");
		
	}
	@Then("user can submit to create a Team by clicking SubmitButton")
	public void user_can_submit_to_create_a_team_by_clicking_submit_button() {
	   System.out.println("Submit button to create a team");
	}


}
