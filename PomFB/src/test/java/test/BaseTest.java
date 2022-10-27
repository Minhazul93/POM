package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import model.CreatNewAccountModel;
import page.CreatenewAccountPage;
import page.HomePage;

public class BaseTest {

	static WebDriver driver;
	static HomePage homepage;
    static CreatenewAccountPage cna;
	
    @BeforeSuite

	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/sourovsmac/downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    }

	public void getHomePage() {
		
		homepage = new HomePage(driver);
	}

public void getCreateNewaccountPage() {
	
	cna = new CreatenewAccountPage(driver);
	
}




}
	
	
	
	





