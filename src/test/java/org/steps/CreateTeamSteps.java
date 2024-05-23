package org.steps;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateTeamSteps extends BaseClass {

	@Given("user is on the These are your task tab")
	public void user_is_on_the_these_are_your_task_tab() {
		launchBrowser("gecko");
		loadUrl("https://dev.onlinevolunteering.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("admin@evolunteering.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("sign_in")).click();
		driver.navigate().to("https://dev.onlinevolunteering.com/event/create");

	}

	@When("user click the each module")
	public void user_click_the_each_module() {
		for (int i = 1; i <= 9; i++) {
			boolean enabled = driver.findElement(By.xpath("(//div[@class='kt-wizard-v3__nav-body'])[" + i + "]"))
					.isEnabled();
			WebElement element = driver.findElement(By.xpath("(//div[@class='kt-wizard-v3__nav-body'])[" + i + "]"));
			String text = element.getText();
			System.out.println(text + "is clickable " + enabled);
		}
	}

	@When("user should navigate to the respective module")
	public void user_should_navigate_to_the_respective_module() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='btn-right btn-link toggle p-2 text-dark']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='btn btn-pill wizard-success doneStep']")).click();
//		Thread.sleep(2000);
//		driver.quit();

	}

	@When("verify the modules are horizontally scrollable")
	public void verify_the_modules_are_horizontally_scrollable() {
		System.out.println("By Manually Verified");
	}

	@When("verify the left and right arrow button is clickable")
	public void verify_the_left_and_right_arrow_button_is_clickable() {
		System.out.println("By Manually Verified");

	}

	@When("validate the left and right button is navigate to previous and next module")
	public void validate_the_left_and_right_button_is_navigate_to_previous_and_next_module() {
		System.out.println("By Manually Verified");

	}

	@When("validate the Next Step button to navigate to the next module")
	public void validate_the_next_step_button_to_navigate_to_the_next_module() {

	}

	@When("user clicks on Select Continent module")
	public void user_clicks_on_select_continent_module() {
//		WebElement element = driver.findElement(By.id("select2-continent_id-container"));
//		element.click();
//		System.out.println("By Manually Verified");
//		Select s = new Select(element);
//		s.selectByIndex(3);

	}

	@When("drop-down and search box will appear for continents")
	public void drop_down_and_search_box_will_appear_for_continents() {
//		WebElement element = driver.findElement(By.id("select2-continent_id-container"));
//		
//		Select s = new Select(element);
//		s.selectByIndex(2);
//		List<WebElement> options = s.getOptions();
//		for (int i = 1 ; i<=options.size(); i++) {
//			boolean enabled = options.get(i).isEnabled();
//			System.out.println(options.get(i).getText()+ " is clickable" +enabled); 
//		}
//		
//		options.get(3).click();

		System.out.println("By Manually Verified");

	}

	@When("user click the Select Country")
	public void user_click_the_select_country() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Countries")
	public void drop_down_appear_for_countries() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Company")
	public void user_click_the_select_company() throws AWTException {
		System.out.println("By Manually Verified");
		
	}

	@When("drop-down appear for Companies")
	public void drop_down_appear_for_companies() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Region Test\\(s)")
	public void user_click_the_select_region_test_s() throws AWTException {
		WebElement element = driver.findElement(By.xpath("//label[text()='Select Region(s)']/parent::div/descendant::ul[@class='select2-selection__rendered']"));
		waitForVisibility(element);
		element.click();
		
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Region 1']"));
		waitForVisibility(element2);
		element2.click();
	}

	@When("drop-down appear for Regions")
	public void drop_down_appear_for_regions() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Site Test\\(s)")
	public void user_click_the_select_site_test_s() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Sites")
	public void drop_down_appear_for_sites() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Department Test\\(s)")
	public void user_click_the_select_department_test_s() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Departments")
	public void drop_down_appear_for_departments() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Team")
	public void user_click_the_select_team() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Teams")
	public void drop_down_appear_for_teams() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select User")
	public void user_click_the_select_user() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Users")
	public void drop_down_appear_for_users() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Additional Event Lead")
	public void user_click_the_select_additional_event_lead() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Event Leads")
	public void drop_down_appear_for_event_leads() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Beneficiary")
	public void user_click_the_select_beneficiary() {
		System.out.println("By Manually Verified");

	}

	@When("drop-down appear for Beneficiaries")
	public void drop_down_appear_for_beneficiaries() {
		System.out.println("By Manually Verified");

	}

	@When("user click the  Select Beneficiary Users")
	public void user_click_the_select_beneficiary_users() {
		System.out.println("By Manually Verified");

	}

	@Then("drop-down appear for Beneficiary Users")
	public void drop_down_appear_for_beneficiary_users() {
		System.out.println("By Manually Verified");
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();

	}

	@Given("User is on Event Overview")
	public void user_is_on_event_overview() {
		System.out.println("By Manually Verified");

	}

	@When("user click on the Template title to enter the title")
	public void user_click_on_the_template_title_to_enter_the_title() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("text_title")).sendKeys("test");
	}

	@When("verify the Template title place holder is enter title")
	public void verify_the_template_title_place_holder_is_enter_title() {
		System.out.println("By Manually Verified");

	}

	@When("click on Title tab to enter the title and the place holder should be enter title")
	public void click_on_title_tab_to_enter_the_title_and_the_place_holder_should_be_enter_title() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("text_sub_title")).sendKeys(
				"When uploading an event, there are three options to choose from that will determine how photographs are managed in the Hub. Firstly, we can opt to notify the ss");
	}

	@When("click on Short Description tab to enter the Description and the place holder should be Enter Short Description")
	public void click_on_short_description_tab_to_enter_the_description_and_the_place_holder_should_be_enter_short_description() {
		System.out.println("By Manually Verified");

	}

	@When("user click on the Feature image module or Browse button")
	public void user_click_on_the_feature_image_module_or_browse_button() {
		System.out.println("By Manually Verified");
		String file = "C:\\Users\\user\\Pictures\\Camera Roll\\FourThree.jpg";
		driver.findElement(By.id("file_feature_image")).sendKeys(file);
	}

	@Then("user should navigate to Local repository to upload")
	public void user_should_navigate_to_local_repository_to_upload() {
		System.out.println("By Manually Verified");

	}

	@When("click on Video button Text to enter the title and the place holder should be Enter Video button text")
	public void click_on_video_button_text_to_enter_the_title_and_the_place_holder_should_be_enter_video_button_text() {
		System.out.println("By Manually Verified");

	}

	@When("click on Enter the embedded code here to your video to enter the embedded code on text")
	public void click_on_enter_the_embedded_code_here_to_your_video_to_enter_the_embedded_code_on_text() {
		System.out.println("By Manually Verified");

	}

	@Then("validate the Previous step button and Next Step button to navigate to the Previous and Next Template")
	public void validate_the_previous_step_button_and_next_step_button_to_navigate_to_the_previous_and_next_template() {
		System.out.println("By Manually Verified");
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();

	}

	@Given("User is on The Volunteering Details")
	public void user_is_on_the_volunteering_details() {
		System.out.println("By Manually Verified");
	}

	@When("click on Ev Number to enter the Ev Number and the place holder should be Ev Number")
	public void click_on_ev_number_to_enter_the_ev_number_and_the_place_holder_should_be_ev_number() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("ev_number")).sendKeys("test123");

	}

	@When("verify Event Creator is clickable")
	public void verify_event_creator_is_clickable() {
		System.out.println("By Manually Verified");

	}

	@When("user click the Select Project Manager drop-down appear for Select Manager")
	public void user_click_the_select_project_manager_drop_down_appear_for_select_manager() throws AWTException {
		System.out.println("By Manually Verified");
		WebElement element2 = driver.findElement(By.id("select2-project_manager_id-container"));
		waitForVisibility(element2);
		element2.click();
		WebElement element = driver.findElement(By.xpath("//span/child::input[@class='select2-search__field']"));
		waitForVisibility(element);
		element.sendKeys("sophie");
		key("enter");
	}

	@When("user click the Select Event Manager drop-down appear for Select Manager")
	public void user_click_the_select_event_manager_drop_down_appear_for_select_manager() throws AWTException {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("select2-event_manager_id-container")).click();
		WebElement element = driver.findElement(By.xpath("//span/child::input[@class='select2-search__field']"));
		waitForVisibility(element);
		element.sendKeys("sophie");
		key("enter");
	}

	@When("user click the Name of the beneficiary you are supporting to enter the Beneficiary Name")
	public void user_click_the_name_of_the_beneficiary_you_are_supporting_to_enter_the_beneficiary_name() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("supporting_beneficiary_name")).sendKeys("test");
	}

	@When("the place holder should be Beneficiary Name")
	public void the_place_holder_should_be_beneficiary_name() {
		System.out.println("By Manually Verified");
	}

	@When("user click the Main point of contacts email address at the beneficiary to enter the email")
	public void user_click_the_main_point_of_contacts_email_address_at_the_beneficiary_to_enter_the_email() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("supporting_beneficiary_email")).sendKeys("test@mail.com");
	}

	@When("the place holder should be Beneficiary Email")
	public void the_place_holder_should_be_beneficiary_email() {
		System.out.println("By Manually Verified");
	}

	@When("user click the What is the date and start time of the event? and Date and Time dialogue should be appear")
	public void user_click_the_what_is_the_date_and_start_time_of_the_event_and_date_and_time_dialogue_should_be_appear() {
		System.out.println("By Manually Verified");	
	}

	@When("validate the calendar modules should be clickable")
	public void validate_the_calendar_modules_should_be_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("user clicks the date the time should be appear")
	public void user_clicks_the_date_the_time_should_be_appear() {
//		WebElement element = driver.findElement(By.xpath("//label[text()='What is the date and start time of the event?']/parent::div/div[@class='input-group date row col-md-12 px-0 mx-0']/child::input"));
//		waitForVisibility(element);
//		element.click();
//		WebElement element2 = driver.findElement(By.xpath("(//td[@class='day today active'])[4]"));
//		waitForVisibility(element2);
//		element2.click();
//		WebElement hour = driver.findElement(By.xpath("(//span[@class='hour active'])[4]"));
//		waitForVisibility(hour);
//		hour.click();
//		WebElement minute = driver.findElement(By.xpath("//span[@class='minute active']"));
//		waitForVisibility(minute);
//		minute.click();
	}

	@When("user clicks the time the minutes should be appear and clickable")
	public void user_clicks_the_time_the_minutes_should_be_appear_and_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("user enter the date, validate the clear button is clickable")
	public void user_enter_the_date_validate_the_clear_button_is_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("validate the How many hours of the volunteer’s time is required?")
	public void validate_the_how_many_hours_of_the_volunteer_s_time_is_required() throws AWTException {
		System.out.println("By Manually Verified");
		WebElement element = driver.findElement(By.id("select2-expected_hours-container"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//*[@type='search']/parent::span/child::input"));
		waitForVisibility(element2);
		element2.sendKeys("1");
		key("enter");

	}

	@When("click on the Hours and Minutes to drop-down the hours and minutes")
	public void click_on_the_hours_and_minutes_to_drop_down_the_hours_and_minutes() throws AWTException {
		System.out.println("By Manually Verified");
		WebElement element = driver.findElement(By.id("select2-expected_minutes-container"));
		element.click();
		WebElement element2 = driver.findElement(By.xpath("//*[@type='search']/parent::span/child::input"));
		waitForVisibility(element2);
		element2.sendKeys("0");
		key("enter");

	}

	@When("user clicks the Choose timezone to view the drop-down for time zones with search box")
	public void user_clicks_the_choose_timezone_to_view_the_drop_down_for_time_zones_with_search_box() {
		System.out.println("By Manually Verified");
//		WebElement element = driver.findElement(By.id("select2-timezone-container"));
	}

	@When("validate The Location Check box")
	public void validate_the_location_check_box() {
		System.out.println("By Manually Verified");
		driver.findElement(By.xpath("//*[@Name='location_unknown']/parent::label")).click();
	}

	@When("click on check box to display address entry")
	public void click_on_check_box_to_display_address_entry() {
		System.out.println("By Manually Verified");
	}

	@When("validate the Street1,Street2, City, Region \\/ State, Post Code, Select Country, Directions modules,Parking Information")
	public void validate_the_street1_street2_city_region_state_post_code_select_country_directions_modules_parking_information() {
		System.out.println("By Manually Verified");
	}

	@When("user click the select country drop-down appear for the countries")
	public void user_click_the_select_country_drop_down_appear_for_the_countries() {
		System.out.println("By Manually Verified");
	}

	@When("user should fill the direction box otherwise, a message \\(This field is required is shown)")
	public void user_should_fill_the_direction_box_otherwise_a_message_this_field_is_required_is_shown() {
		System.out.println("By Manually Verified");
	}

	@When("user should fill the Parking Information box otherwise, a message \\(This field is required is shown)")
	public void user_should_fill_the_parking_information_box_otherwise_a_message_this_field_is_required_is_shown() {

	}

	@When("validate the check box I don’t know the exact location yet is clickable")
	public void validate_the_check_box_i_don_t_know_the_exact_location_yet_is_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("validate Please enter the What3 words of your location is clickable and the place holder should be Enter What3 words")
	public void validate_please_enter_the_what3_words_of_your_location_is_clickable_and_the_place_holder_should_be_enter_what3_words() {
		System.out.println("By Manually Verified");
	}

	@When("user validate the Additional details for the volunteers")
	public void user_validate_the_additional_details_for_the_volunteers() {
		System.out.println("By Manually Verified");
	}

	@When("verify Remote, Indoors, Outdoors and Other, please specify radio buttons are clickable")
	public void verify_remote_indoors_outdoors_and_other_please_specify_radio_buttons_are_clickable() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("indoors")).click();
	}

	@When("validate the remote button to display the Please enter video conference link text box")
	public void validate_the_remote_button_to_display_the_please_enter_video_conference_link_text_box() {
		System.out.println("By Manually Verified");
	}

	@When("verify the place holder should be Enter video conference link")
	public void verify_the_place_holder_should_be_enter_video_conference_link() {
		System.out.println("By Manually Verified");
	}

	@Given("user is on volunteering event and volunteers tasks\\/activities")
	public void user_is_on_volunteering_event_and_volunteers_tasks_activities() {
		System.out.println("By Manually Verified");
	}

	@When("user click Describe the volunteering event and volunteers tasks\\/activities to enter text")
	public void user_click_describe_the_volunteering_event_and_volunteers_tasks_activities_to_enter_text() {
		System.out.println("By Manually Verified");
	}

	@When("validate the letter formatting options are clickable")
	public void validate_the_letter_formatting_options_are_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("user click the Impact the volunteering event will have on the charity to enter text")
	public void user_click_the_impact_the_volunteering_event_will_have_on_the_charity_to_enter_text() {
		System.out.println("By Manually Verified");
		driver.findElement(By.xpath("//div[@class='note-editable']")).sendKeys("test");
	}

	@When("verify the place holder text placeholder Example: Keeping residents in a care home company not only enhances their well-being but also strengthens the charitys mission by creating a supportive and joyful environment that positively impacts lives.")
	public void verify_the_place_holder_text_placeholder_example_keeping_residents_in_a_care_home_company_not_only_enhances_their_well_being_but_also_strengthens_the_charitys_mission_by_creating_a_supportive_and_joyful_environment_that_positively_impacts_lives() {
		System.out.println("By Manually Verified");
		driver.findElement(By.id("impact_statement_title")).sendKeys("test");
	}

	@When("validate Upload documents to go into document hub, Upload your Risk Assessment and Upload your Confidentiality Cause to navigate to uploading files")
	public void validate_upload_documents_to_go_into_document_hub_upload_your_risk_assessment_and_upload_your_confidentiality_cause_to_navigate_to_uploading_files() {
		System.out.println("By Manually Verified");
	}

	@Then("user click Next Step button to navigate to Volunteers Impact")
	public void user_click_next_step_button_to_navigate_to_volunteers_impact() {
		System.out.println("By Manually Verified");
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();

	}

	@Given("user on Volunteering Impact page")
	public void user_on_volunteering_impact_page() {
		System.out.println("By Manually Verified");
	}

	@When("click on every option validate the options are clickable")
	public void click_on_every_option_validate_the_options_are_clickable() {
		for (int i = 1; i <=9; i++) {
			WebElement element = driver.findElement(By.xpath("(//div[@class='col-md-3 relative relativeuncate'])["+i+"]"));
			waitForVisibility(element);
			element.click();
		}
		
	}

	@When("mouse hover each option to verify the statement of the specific module")
	public void mouse_hover_each_option_to_verify_the_statement_of_the_specific_module() {
		System.out.println("By Manually Verified");
	}

	@When("verify user can click all the module")
	public void verify_user_can_click_all_the_module() {
		System.out.println("By Manually Verified");
	}

	@When("verify the selected modules are highlighted and rest are not")
	public void verify_the_selected_modules_are_highlighted_and_rest_are_not() {
		System.out.println("By Manually Verified");
	}

	@Then("user click Next Step button to navigate to Set up the Sign-up Form")
	public void user_click_next_step_button_to_navigate_to_set_up_the_sign_up_form() {
		waitForVisibility(driver.findElement(By.xpath("//button[@data-slide='next']")));
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();
	}

	
	
	
	@Given("user on Sign-up Form page")
	public void user_on_sign_up_form_page() {
		System.out.println("By Manually Verified");
}

	@When("click on Next Steps to enter the text")
	public void click_on_next_steps_to_enter_the_text() {
//		driver.switchTo().frame(0);
//		WebElement element = driver.findElement(By.xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])[1]"));
//		element.sendKeys("Automated testing is the application of software tools to automate a human-driven manual process of reviewing and validating a software product");
		}

	@When("verify the Source button and Formatting options are clickable")
	public void verify_the_source_button_and_formatting_options_are_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("click What is the maximum capacity of volunteers for this event? module to enter the number")
	public void click_what_is_the_maximum_capacity_of_volunteers_for_this_event_module_to_enter_the_number() {
		driver.findElement(By.id("text_volunteers_limit")).sendKeys("7");
	}

	@When("verify the up and down arrow to validate the count")
	public void verify_the_up_and_down_arrow_to_validate_the_count() {
		System.out.println("By Manually Verified");
	}

	@When("user click What text would you like to appear on the sign-up button? to enter the text, verify the place holder should be Enter Sign up button text")
	public void user_click_what_text_would_you_like_to_appear_on_the_sign_up_button_to_enter_the_text_verify_the_place_holder_should_be_enter_sign_up_button_text() {
		driver.findElement(By.id("sign_up_button_text")).sendKeys("test");
	}

	@When("user click the Sign-Up Deadline \\(date box which adds countdown to frontend)and Date and Time dialogue should be appear")
	public void user_click_the_sign_up_deadline_date_box_which_adds_countdown_to_frontend_and_date_and_time_dialogue_should_be_appear() {
		System.out.println("By Manually Verified");
	}

	@When("validate the additional features added options")
	public void validate_the_additional_features_added_options() {
		System.out.println("By Manually Verified");
	}

	@When("verify all the toggle switches below the additional feature")
	public void verify_all_the_toggle_switches_below_the_additional_feature() {
		System.out.println("By Manually Verified");
	}

	@When("verify Email Address text box to enter text and validate add button to add the additional text box")
	public void verify_email_address_text_box_to_enter_text_and_validate_add_button_to_add_the_additional_text_box() {
		System.out.println("By Manually Verified");
	}

	@When("verify the garbage button to reduce the text box")
	public void verify_the_garbage_button_to_reduce_the_text_box() {
		System.out.println("By Manually Verified");
	}

	@Then("click the Next step button to navigate to Event Confirmation Page")
	public void click_the_next_step_button_to_navigate_to_event_confirmation_page() {
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();
	}

	@Given("user on Event Confirmation page")
	public void user_on_event_confirmation_page() {
		System.out.println("By Manually Verified");
	}

	@When("user click the Send Confirmation email toggle off then below tabs should disappear")
	public void user_click_the_send_confirmation_email_toggle_off_then_below_tabs_should_disappear() {
		System.out.println("By Manually Verified");
	}

	@When("validate the toggle on and verify the below modules")
	public void validate_the_toggle_on_and_verify_the_below_modules() {
		System.out.println("By Manually Verified");
	}

	@When("user click Please choose your template here and the search box and drop down should appear")
	public void user_click_please_choose_your_template_here_and_the_search_box_and_drop_down_should_appear() {
		System.out.println("By Manually Verified");
	}

	@When("verify the Email subject text box to enter the email and verify the place holder Enter Email Subject")
	public void verify_the_email_subject_text_box_to_enter_the_email_and_verify_the_place_holder_enter_email_subject() {
	
		driver.findElement(By.id("email_template_subject")).sendKeys("test@mail.com");
	}

	@When("user validate the Body of email module to enter the text")
	public void user_validate_the_body_of_email_module_to_enter_the_text() {
		System.out.println("By Manually Verified");
	}

	@When("validate the font formatting options are clickable")
	public void validate_the_font_formatting_options_are_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("click on Add Dynamic Tags to verify the drop down")
	public void click_on_add_dynamic_tags_to_verify_the_drop_down() {
		System.out.println("By Manually Verified");
	}

	@Then("click on Next Step to navigate to Volunteering itinerary")
	public void click_on_next_step_to_navigate_to_volunteering_itinerary() {
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();
	}

	
	
	@Given("user on Volunteering itinerary page")
	public void user_on_volunteering_itinerary_page() {
		System.out.println("By Manually Verified");
	}

	@When("user click on Date VI’s need to be reviewed module to drop down the Date *")
	public void user_click_on_date_vi_s_need_to_be_reviewed_module_to_drop_down_the_date() {
		System.out.println("By Manually Verified");
	}

	@When("click clear button to clear the entered date")
	public void click_clear_button_to_clear_the_entered_date() {
		System.out.println("By Manually Verified");
	}

	@When("user click the Send Volunteering Itinerary toggle to off then the below module should disappear")
	public void user_click_the_send_volunteering_itinerary_toggle_to_off_then_the_below_module_should_disappear() {
		System.out.println("By Manually Verified");
	}

	@When("validate the Please choose your template here module to verify the search box and drop down")
	public void validate_the_please_choose_your_template_here_module_to_verify_the_search_box_and_drop_down() {
		System.out.println("By Manually Verified");
	}

	@When("verify the Please choose the date and time module to drop down the Date & Time")
	public void verify_the_please_choose_the_date_and_time_module_to_drop_down_the_date_time() {
		System.out.println("By Manually Verified");
	}

	@When("user click on Who is the Event Facilitator? module to enter the Contact Name and Contact Time")
	public void user_click_on_who_is_the_event_facilitator_module_to_enter_the_contact_name_and_contact_time() {
		driver.findElement(By.id("point_contact_name")).sendKeys("tester");
		}

	@When("verify the place holder Enter Point Contact Name and Enter Point Contact Number")
	public void verify_the_place_holder_enter_point_contact_name_and_enter_point_contact_number() {
		driver.findElement(By.id("point_contact_no")).sendKeys("1234567890");
	}

	@When("user click the Upload company logo and browse button to verify the upload option")
	public void user_click_the_upload_company_logo_and_browse_button_to_verify_the_upload_option() {
		String file = "C:\\Users\\user\\Pictures\\Camera Roll\\test.jpg";
		driver.findElement(By.id("company_logo")).sendKeys(file);
	}

	@When("user click the Upload documents to be sent as an attachment with the volunteering itinerary and browse button to verify the upload option")
	public void user_click_the_upload_documents_to_be_sent_as_an_attachment_with_the_volunteering_itinerary_and_browse_button_to_verify_the_upload_option() {
		System.out.println("By Manually Verified");
	}

	@When("user click the Subject module to enter the text")
	public void user_click_the_subject_module_to_enter_the_text() {
		driver.findElement(By.id("itenary_template_subject")).sendKeys("regression testing is the testing to test the entire application");

	}

	@When("validate the Body of email box to verify the font formatting options are clickable")
	public void validate_the_body_of_email_box_to_verify_the_font_formatting_options_are_clickable() {
		System.out.println("By Manually Verified");
	}

	@Then("click on Feedback Survey to navigate to Feedback Survey")
	public void click_on_feedback_survey_to_navigate_to_feedback_survey() {
			driver.findElement(By.xpath("//button[@data-slide='next']")).click();

	}

	@Given("user on Notifications Page")
	public void user_on_notifications_page() {
driver.findElement(By.id("feedback_template_subject")).sendKeys("test@mail.com");
driver.findElement(By.xpath("//button[@data-slide='next']")).click();


	}

	@When("validate switch off the Send Feedback Survey toggle to disappear the below modules")
	public void validate_switch_off_the_send_feedback_survey_toggle_to_disappear_the_below_modules() {
		System.out.println("By Manually Verified");
	}

	@When("click on Select Feedback Survey Email Template verify the search box and drop down")
	public void click_on_select_feedback_survey_email_template_verify_the_search_box_and_drop_down() {
		System.out.println("By Manually Verified");
	}

	@When("click the Email Subject to enter the Email Subject and verify the place holder should Enter Email Subject")
	public void click_the_email_subject_to_enter_the_email_subject_and_verify_the_place_holder_should_enter_email_subject() {
		System.out.println("By Manually Verified");
	}

	@When("validate the Moderate feedback before publishing toggle")
	public void validate_the_moderate_feedback_before_publishing_toggle() {
		System.out.println("By Manually Verified");
	}

	@When("user click the save as template button to navigate to the Save Feedback Survey Email Template")
	public void user_click_the_save_as_template_button_to_navigate_to_the_save_feedback_survey_email_template() {
		System.out.println("By Manually Verified");
	}

	@When("verify the Save Feedback Survey Email Template to validate the yes and cancel buttons are clickable")
	public void verify_the_save_feedback_survey_email_template_to_validate_the_yes_and_cancel_buttons_are_clickable() {
		System.out.println("By Manually Verified");
	}

	@When("user click on Feedback Template to open the search box and drop down")
	public void user_click_on_feedback_template_to_open_the_search_box_and_drop_down() {
		System.out.println("By Manually Verified");
	}

	@When("click on Add Questions button to open the Question Type module")
	public void click_on_add_questions_button_to_open_the_question_type_module() {
		System.out.println("By Manually Verified");
	}

	@When("verify the Question Type module drop down and verify the Is Required check box")
	public void verify_the_question_type_module_drop_down_and_verify_the_is_required_check_box() {
		System.out.println("By Manually Verified");
	}

	@When("to delete the new question box validate the remove button is clickable and verify the pop-up before removing")
	public void to_delete_the_new_question_box_validate_the_remove_button_is_clickable_and_verify_the_pop_up_before_removing() {
		System.out.println("By Manually Verified");
	}

	@When("verify the save as template button is clickable and validate the pop-up")
	public void verify_the_save_as_template_button_is_clickable_and_validate_the_pop_up() {
		System.out.println("By Manually Verified");
	}

	@When("verify the Select Feedback Survey Template drop-down and search box")
	public void verify_the_select_feedback_survey_template_drop_down_and_search_box() {
		System.out.println("By Manually Verified");
	}

	@Then("verify the next step button to move on to the upcoming page")
	public void verify_the_next_step_button_to_move_on_to_the_upcoming_page() {
		System.out.println("By Manually Verified");
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();
	}
	


	
	
	@Given("user can enter first name, last name and email")
	public void user_can_enter_first_name_last_name_and_email() {
		System.out.println("By Manually Verified");
		
		driver.findElement(By.id("attendee_first_name")).sendKeys("Sophie");
		driver.findElement(By.id("attendee_last_name")).sendKeys("Guthrie");
		driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("test123@mail.com");
		}
	@When("user click on add button to add the another set of entry")
	public void user_click_on_add_button_to_add_the_another_set_of_entry() {

		driver.findElement(By.xpath("//button[@class='btn btn-primary add-more-button']")).click();
	}
	@When("user click on the trash button to remove the addition of entry")
	public void user_click_on_the_trash_button_to_remove_the_addition_of_entry() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-danger remove-button'])[2]")).click();
	}
	@Then("verify the next step button to move on to the review page")
	public void verify_the_next_step_button_to_move_on_to_the_review_page() {
		driver.findElement(By.xpath("//button[@data-slide='next']")).click();
	}




	@Given("user can see the Congratulation message")
	public void user_can_see_the_congratulation_message() {
	    String congratsMessage = driver.findElement(By.xpath("//strong[contains(text(),'Congratulations')]")).getText();
	System.out.println(congratsMessage);
	
	}
	@When("user scroll, user can see the overview of all the tabs")
	public void user_scroll_user_can_see_the_overview_of_all_the_tabs() {
			scroll();
				
	}
	@Then("validate the submit button is clickable")
	public void validate_the_submit_button_is_clickable() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//button[@class='btn b-radius btn-success btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u']"));

		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		Thread.sleep(10000);
	}
	@When("click on previous step button to check the previous pages")
	public void click_on_previous_step_button_to_check_the_previous_pages() throws InterruptedException {

		for (int i = 0; i <=9; i++) {
			driver.findElement(By.xpath("//button[@class=' b-radius btn btn-brand btn-md btn-tall btn-wide kt-font-bold kt-font-transform-u tabClick btn_action_prev']")).click();
			Thread.sleep(2000);
		}

	}




}
