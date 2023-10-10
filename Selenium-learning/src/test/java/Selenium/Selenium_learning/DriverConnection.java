package Selenium.Selenium_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConnection {
	public WebDriver getConnection(String url) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	    
	}

}
