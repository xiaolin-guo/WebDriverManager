package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

	static WebDriver driver = null;
	static By textbox_search = By.name("q");
	static By search_button = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");

//constructor
	public GoogleSearchPageObject(WebDriver driver) {
		GoogleSearchPageObject.driver = driver;
	}

//Actions
	public void setTextInSearchBox(String text ) {
		driver.findElement(textbox_search).sendKeys(text);
		
	};
	
	public void ClickSearchButton() {
		driver.findElement(search_button).click();
	};
	
	public void EnterReturnKey() {
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	};
	
	public void ClearSearchBox() {
		driver.findElement(textbox_search).clear();
		
	};
}
