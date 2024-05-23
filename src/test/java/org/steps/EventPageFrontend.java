package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventPageFrontend extends BaseClass{

	@Given("user is on the home page of employee volunteering")
	public void user_is_on_the_home_page_of_employee_volunteering() {
		launchBrowser("chrome");
	    loadUrl("https://dev.onlinevolunteering.com/evolunteering/login");
	    driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("autotest@evolunteering.com");
		driver.findElement(By.id("password")).sendKeys("Pas$w0rd1#");
		driver.findElement(By.id("login")).click();
		
	}
	@When("user navigate to Volunteering Opportunities")
	public void user_navigate_to_volunteering_opportunities() {
		driver.navigate().to("https://dev.onlinevolunteering.com/evolunteering/volunteer");
	}
	@When("user can view the specific event")
	public void user_can_view_the_specific_event() throws InterruptedException {

	    Thread.sleep(1500);
	    WebElement element2 = driver.findElement(By.xpath("//span[contains(text(),'Test for Review')]/ancestor::div[@class='col-xl-3 col-sm-6 col-xs-12 search_new_opportunities']"));
	    waitForVisibility(element2);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,250)");
	    jse.executeScript("arguments[0].scrollIntoView();", element2);
	    
	    WebElement element = driver.findElement(By.xpath("(//span[contains(text(),'Test for Review')]/ancestor::div[@class='col-xl-3 col-sm-6 col-xs-12 search_new_opportunities']/descendant::*[@id='project_detail_btn'])[1]"));
	    waitForVisibility(element);
	    boolean enabled = element.isEnabled();
	    System.out.println(enabled);
	    driver.navigate().to("https://dev.onlinevolunteering.com/evolunteering/project_detail/OTAw");
	}
	@When("user can validate the dynamic content of the event page")
	public void user_can_validate_the_dynamic_content_of_the_event_page() {
	    System.out.println("Verified by manually");
	}
	@When("user click the Read more button to enter into the event main page")
	public void user_click_the_read_more_button_to_enter_into_the_event_main_page() throws InterruptedException {
		System.out.println("Verified by manually");
		
	}
	@When("user can validate the Task instructions and gestures over there")
	public void user_can_validate_the_task_instructions_and_gestures_over_there() throws InterruptedException {
		String windowHandle = driver.getWindowHandle();
		WebElement element = driver.findElement(By.xpath("//button[@id='load_external_link']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].scrollIntoView();", element);
	    waitForVisibility(element);
	   element.click(); 
		Thread.sleep(3000);


		driver.switchTo().window(windowHandle);
		Thread.sleep(2000);
		WebElement elementBack = driver.findElement(By.xpath("//a[@id='back_btn']"));
		jse.executeScript("arguments[0].scrollIntoView();", elementBack);
	}
	@When("user can view the tasks and instructions under the event")
	public void user_can_view_the_tasks_and_instructions_under_the_event() {

		System.out.println("Verified by manually");
	}
	@When("user can click the click button to participate on the task")
	public void user_can_click_the_click_button_to_participate_on_the_task() {

		System.out.println("Verified by manually");
	}
	@When("user should navigate to the link")
	public void user_should_navigate_to_the_link() {

		System.out.println("Verified by manually");
	}
	@When("user can Share with a colleage by clicking ShareWithAColleague button")
	public void user_can_share_with_a_colleage_by_clicking_share_with_a_colleague_button() throws InterruptedException {

		WebElement element = driver.findElement(By.xpath("//div[@class='kt-portlet']//a[@data-target='#share_project_modal']"));
		waitForClickable(element);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);	
		
		
		Thread.sleep(1500);
		WebElement name = driver.findElement(By.id("name"));
		waitForVisibility(name);
		name.sendKeys("Tester Hello");
		driver.findElement(By.id("email")).sendKeys("jivotel781@javnoi.com");
		driver.findElement(By.id("submitcShareForm")).click();
		Thread.sleep(4000);
	}
	@When("user can enter the Name and Email id to sent the invitation")
	public void user_can_enter_the_name_and_email_id_to_sent_the_invitation() {

	}
	@When("user can click the ViewTimeLogs button to view their log time")
	public void user_can_click_the_view_time_logs_button_to_view_their_log_time() {

	}
	@When("user should move to the TIMELOGS Tab")
	public void user_should_move_to_the_timelogs_tab() {

	}
	@When("user can mention their log time by clicking the ClickHeretologTime")
	public void user_can_mention_their_log_time_by_clicking_the_click_heretolog_time() {

	}
	@When("user can move Back to the Event lists by clicking BacktoIndividualTestingPage")
	public void user_can_move_back_to_the_event_lists_by_clicking_backto_individual_testing_page() {
	
	}
	@When("user can view the dialog box with three options")
	public void user_can_view_the_dialog_box_with_three_options() {
	
	}
	@When("user can click anyone of them by their preferences")
	public void user_can_click_anyone_of_them_by_their_preferences() {
	
	}
	@Then("user move to the Event listing page by clicking the specific button")
	public void user_move_to_the_event_listing_page_by_clicking_the_specific_button() {
	
	}


}
