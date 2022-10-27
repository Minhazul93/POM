package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatNewAccountModel extends BaseModel{

	public CreatNewAccountModel(WebDriver a1) {
		
		super(a1);
	}

	public WebElement getfirstname() throws InterruptedException {
		//Thread.sleep(2000);
	
		WebElement element1= driver.findElement(By.xpath("//input[@name='firstname']"));
		
		return element1;
		
		}
	
	
	
	
	
	
}
