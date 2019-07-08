package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	
//locators for this page
	public static WebElement HomePageButton(WebDriver driver) 
	{
		WebElement element = driver.findElement(By.xpath("//ul[@class='nav-menu sf-js-enabled sf-arrows']//a[contains(text(),'Ê×Ò³')]"));
		return element;
	}
	
	public static WebElement ProductPageButton(WebDriver driver) 
	{
		WebElement element = driver.findElement(By.xpath("//ul[@class='nav-menu sf-js-enabled sf-arrows']//a[contains(text(),'²úÆ·')]"));
		return element;
	}
	
	public static WebElement LoginPageButton(WebDriver driver) 
	{
		WebElement element = driver.findElement(By.xpath("//ul[@class='nav-menu sf-js-enabled sf-arrows']//a[contains(text(),'µÇÂ¼(Login)')]"));
		return element;
	}
	
	
//methods for this page	
	public static void clickHomePageButton(WebDriver driver)
	{
		HomePageButton(driver).click();
	};
	
	public static void clickProductButton(WebDriver driver)
	{
		ProductPageButton(driver).click();
	};
	
	public static void clickLoginPageButton(WebDriver driver)
	{
		LoginPageButton(driver).click();
	};
}


