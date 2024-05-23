package com.testNG;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFunctionalities extends BaseClass {
	
	public String loginUrl ="https://dev.onlinevolunteering.com/evolunteering/login";

//	@BeforeTest
//	public void startReport() {
//		initializeReport();
//	}
//
//	@AfterTest
//	public void endReport() {
//		extent.flush();
//	}


		@Test
		public void user_should_be_on_the_login_page() {
			launchBrowser("edge");
		    loadUrl("https://dev.onlinevolunteering.com/evolunteering/login");
		}
		@Test
		public void user_click_the_sign_up_button() {
		   WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign up!']"));
		   if(signUp.isEnabled()==true) {
			   System.out.println("Sign Up button is Clickable");
		   }else {
			   System.out.println("Sign Up button is Non Clickable");
		   }
		}
		@Test
		public void the_button_is_clickable() {

		}
		@Test
		public void verify_the_www_onlinevolunteering_com_link_is_clickable() {
			WebElement signUp = driver.findElement(By.xpath("//a[text()='www.onlinevolunteering.com']"));
			   if(signUp.isEnabled()==true) {
				   System.out.println("User Page button is Clickable");
			   }else {
				   System.out.println("User Page button is Non Clickable");
			   }
		}
		@Test
		public void verify_the_contact_button_is_clickable() {
			WebElement signUp = driver.findElement(By.xpath("//a[text()='Contact']"));
			   if(signUp.isEnabled()==true) {
				   System.out.println("Contact button is Clickable");
			   }else {
				   System.out.println("Contact button is Non Clickable");
			   }
		}
		@Test
		public void verify_the_privacy_policy_button_is_clickable() {
			WebElement signUp = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
			   if(signUp.isEnabled()==true) {
				   System.out.println("Privacy Policy is Clickable");
			   }else {
				   System.out.println("Privacy Policy is Non Clickable");
			   }
		}
		@Test
		public void verify_the_cookie_policy_button_is_clickable() {
			WebElement signUp = driver.findElement(By.xpath("//a[text()='Cookie Policy']"));
			   if(signUp.isEnabled()==true) {
				   System.out.println("Cookie Policy is Clickable");
			   }else {
				   System.out.println("Cookie Policy is Non Clickable");
			   }
		}
		@Test
		public void verify_the_forgot_password_button_is_clickable() {
			WebElement frgtpswd = driver.findElement(By.xpath("//a[@href='https://dev.onlinevolunteering.com/evolunteering/password/reset']"));
			if(frgtpswd.isEnabled()==true) {
				   System.out.println("Forgot Password is Clickable");
			   }else {
				   System.out.println("Forgot Password is Non Clickable");
			   }
		}
		@Test
		public void user_enter_the_username_and_password() throws InterruptedException {
		    WebElement email = driver.findElement(By.id("email"));
		    email.sendKeys("autotest@evolunteering.com");
		    Thread.sleep(2000);
		    WebElement pswd = driver.findElement(By.id("password"));
		    pswd.sendKeys("Pas$w0rd1#");
		    Thread.sleep(2000);
		    driver.findElement(By.id("login")).click();
		}
		@Test
		public void click_the_sign_in_button() {

			System.out.println("Sign in button clicked");
		}
		@Test
		public void user_navigate_to_the_home_page() {
		    
		}
		
		@Test
		public void user_should_be_on_the_home_page() {
		    System.out.println("user is on the home page ");
		}
		@Test
		public void user_mouse_hover_the_my_profile_button() throws InterruptedException {
			WebElement element = driver.findElement(By.xpath("//div[@class='kt-header__topbar-wrapper profileData']"));
		    Actions ac = new Actions(driver);
		    ac.moveToElement(element);
		    Thread.sleep(7000);
		    element.click();
		    Thread.sleep(2000);
		}
		@Test
		public void verify_the_sign_out_button_is_clickable() {
			WebElement element = driver.findElement(By.xpath("(//a[text()='Sign Out'])[1]"));
			
			if(element.isEnabled()==true) {
				   System.out.println("Sign Out button is Clickable");
			   }else {
				   System.out.println("Sign Out button is Non Clickable");
			   }
		}
		@Test
		public void user_click_sign_out_button() throws InterruptedException {
			
		    driver.findElement(By.xpath("(//a[text()='Sign Out'])[1]")).click();
		    Thread.sleep(3000);
		}
		@Test
		public void user_navigate_to_the_login_page() {
		    String currentUrl = driver.getCurrentUrl();
		    String actualUrl = "https://dev.onlinevolunteering.com/evolunteering/login";
		    if (currentUrl.equals(actualUrl)) {
				System.out.println("user navigate to the login page");
			}else {
				System.out.println("user is not navigate to the login page");
			}
		}
		
		@Test
		public void user_click_the_sign_up_button_user_should_navigate_to_sign_up_page() throws InterruptedException {
			driver.findElement(By.xpath("//a[text()='Sign up!']")).click();
			Thread.sleep(4000);
		}
		@Test
		public void user_click_back_then_user_navigate_to_login_page() {
		    driver.navigate().back();
		}
		@Test
		public void user_click_the_privacy_policy_document_should_be_open() {
			driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
			driver.navigate().to(loginUrl);
		}
		@Test
		public void user_click_the_cookie_policy_document_should_be_open() {
			driver.findElement(By.xpath("//a[text()='Cookie Policy']")).click();
			driver.navigate().to(loginUrl);
		}
		@Test
		public void user_click_the_url_user_should_navigate_to_https_www_employeevolunteering_com() throws InterruptedException {
			driver.findElement(By.xpath("//a[text()='www.onlinevolunteering.com']")).click();
			Thread.sleep(7000);
			
		}
		@Test
		public void user_click_the_contact_button_mail_box_should_open() throws InterruptedException {
			driver.navigate().to(loginUrl);
			driver.findElement(By.xpath("//a[text()='Contact']")).click();
			
			Thread.sleep(5000);
			driver.quit();
		}



	}

	

