package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreatNewAccountModel;

public class CreatenewAccountPage extends CreatNewAccountModel {

	public CreatenewAccountPage(WebDriver b1) {
		
		super(b1);
	}

public void typefirstname() throws InterruptedException {
	
	WebElement e1= getfirstname();
	
	e1.sendKeys("minhazul");
	
	
}







}
