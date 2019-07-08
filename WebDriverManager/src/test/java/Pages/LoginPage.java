package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

//locators for this page
	static WebElement UserName(WebDriver driver)
	{
		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		return element;
	};
	
	static WebElement Password(WebDriver driver)
	{
		WebElement element = driver.findElement(By.xpath("//input[@id='password']"));
		return element;
	};
	
	static WebElement LoginButton(WebDriver driver)
	{
		WebElement element = driver.findElement(By.xpath("//a[@id='loginBtn']"));
		return element;
	};
	

//methods for this page
	public static void loginAction(WebDriver driver) {
		
		driver.findElement(By.linkText("µÇÂ¼")).click();
		driver.findElement(By.name("username")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.id("loginBtn")).click();
	};
	
	public static void ClickLoginButton(WebDriver driver){
		
		LoginButton(driver).click();
	};
}
