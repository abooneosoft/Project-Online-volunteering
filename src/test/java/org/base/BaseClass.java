package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class BaseClass {
	
	public static WebDriver driver;
	
//	public static ExtentSparkReporter sparkReporter;
//	public static ExtentReports extent;
//    public static ExtentTest test;
	

	public static void launchBrowser(String driverName) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
//		driver = new ChromeDriver();
		
		if (driverName.equals("gecko")) {
			FirefoxOptions options = new FirefoxOptions();
			  driver = new FirefoxDriver(options);
		}else if (driverName.equals("edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver(options);
		}else if (driverName.equals("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver();
			
		}
		
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public void waitForVisibility(WebElement element) throws Error{
        new WebDriverWait(driver,java.time.Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOf(element));
 }
	public void waitForClickable(WebElement element) throws Error{
        new WebDriverWait(driver,java.time.Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(element));
 }
	
//	//System.getProperty("user.dir")+
//	public void initializeReport(){
//        sparkReporter =  new ExtentSparkReporter(System.getProperty("user.dir")+"OnlineVolunteering1/target/report1.html");
//        sparkReporter.config().setDocumentTitle("AutomationReport");
//        sparkReporter.config().setReportName("Automation Test Execution Report");
//        sparkReporter.config().setTheme(Theme.STANDARD);
//        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//        extent =new ExtentReports();
//        extent.attachReporter(sparkReporter);
//    }
	
	public void key(String e) throws AWTException {
		Robot r = new Robot();
		if(e.equalsIgnoreCase("enter")) {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}else if(e.equalsIgnoreCase("esc")){
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
		}
		
		
	}
	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollBy(0,250)", "");
	}
}


