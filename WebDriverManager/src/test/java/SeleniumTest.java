import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static WebDriver driver;
	public static void main(String[] args) {
		SetUpDriver();
		loginAction();
		EnterPlatForm();
	};
	
		public static void SetUpDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://www.worldwidetracing.com"); 
		};
		
		
		public static void loginAction() {
			driver.findElement(By.linkText("��¼")).click();
			driver.findElement(By.name("username")).sendKeys("test");
			driver.findElement(By.name("password")).sendKeys("abc123");
			driver.findElement(By.id("loginBtn")).click();
		};
		
		
		public static void EnterPlatForm() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("����̨")));
		driver.findElement(By.linkText("����̨")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sys_div op-div2']")));
		driver.findElement(By.xpath("//div[@class='sys_div op-div2']")).click();
		};
	};


