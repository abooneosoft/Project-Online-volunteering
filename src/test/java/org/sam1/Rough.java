package org.sam1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Rough {


	public static void main(String[] args) {
		System.out.println("hello Online Volunteering");
		
		//System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		 WebDriver driver = new FirefoxDriver(options);
		 
		 driver.get("https://dev.onlinevolunteering.com/evolunteering/login");
	}
}
