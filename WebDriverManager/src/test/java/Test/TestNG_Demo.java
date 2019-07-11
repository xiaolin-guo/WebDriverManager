package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {

    WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
	};
	
	
	@Test
	public void GoogleSearchTest() throws InterruptedException {		
		GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);
		searchPageObject.setTextInSearchBox("A B C D");
		Thread.sleep(2000);
		searchPageObject.ClickSearchButton();
		Thread.sleep(2000);
	};
	

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test completed successfully!");
	};
}
