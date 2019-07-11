package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.GoogleSearchPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_ExtentReport {
	WebDriver driver = null;
	ExtentHtmlReporter html;
	ExtentReports extent; 
	
	@BeforeSuite
	public void setUpTest() throws InterruptedException {
	    
	    html = new ExtentHtmlReporter("Extent.html");
	    extent = new ExtentReports();
	    extent.attachReporter(html);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
	};
	
	 
	@Test
	public void GoogleSearchTest1() throws InterruptedException {		
		ExtentTest test = extent.createTest("This is GoogleSearchTest1");
		
		GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);
		
		searchPageObject.setTextInSearchBox("A B C D");
		test.log(Status.PASS, "Insert search content");
		
		Thread.sleep(2000);
		searchPageObject.ClickSearchButton();
		test.log(Status.PASS, "Click search button");
		
		Thread.sleep(2000);
		test.pass("GoogleSearchTest1 Passed");
	};
	
	@Test
	public void GoogleSearchTest2() throws InterruptedException {	
		ExtentTest test = extent.createTest("This is GoogleSearchTest2");
		
		GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);
		searchPageObject.ClearSearchBox();
		searchPageObject.setTextInSearchBox("A B C D E");
		test.log(Status.PASS, "Insert search content");
		
		Thread.sleep(2000);
		searchPageObject.EnterReturnKey();
		test.log(Status.PASS, "Click search button");
		
		Thread.sleep(2000);
		test.pass("GoogleSearchTest2 Passed");
	};
	
		 
	@AfterSuite
	public void tearDownTest() {
		driver.close();
		System.out.println("Test completed successfully!");
		extent.flush();
	};
}
