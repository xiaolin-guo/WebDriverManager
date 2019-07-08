import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.HomePage;
import Pages.LoginPage;

public class SeleniumTest2 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		SetUpDriver();
		LoginTest(driver);
	};
	
		public static void SetUpDriver() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://www.worldwidetracing.com"); 
			driver.manage().window().maximize();
			Thread.sleep(5000);
		};
		
		
		static void LoginTest(WebDriver driver) {
			Pages.HomePage.clickLoginPageButton(driver);
			Pages.LoginPage.loginAction(driver);
			Pages.LoginPage.ClickLoginButton(driver);			
			
		};
	};


