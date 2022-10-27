package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel extends BaseModel {

	public HomePageModel(WebDriver b) {
		
		super(b);
	}
public WebElement getCreatNewAccount() throws InterruptedException {
	
	
	WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
	
	return element;

}
}
