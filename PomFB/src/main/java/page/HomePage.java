package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomePageModel;

public class HomePage extends HomePageModel{

	public HomePage(WebDriver c) {
		
		super(c);
	}
	public void clickoncreatebutton() throws InterruptedException {
		
	WebElement e=getCreatNewAccount();
			
	e.click();
	
	
	}
		
	
	
	
	
		
	}

