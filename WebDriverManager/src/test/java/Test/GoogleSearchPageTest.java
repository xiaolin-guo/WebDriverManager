package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		GoogleSearchTest();
	}
	
	public static void GoogleSearchTest() throws InterruptedException {		
		SetUpDriver();
		GoogleSearchPageObject searchPageObject = new GoogleSearchPageObject(driver);
		searchPageObject.setTextInSearchBox("A B C D");
		Thread.sleep(3000);
		searchPageObject.ClickSearchButton();
	};
	

	public static void SetUpDriver() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
	};
	
}
