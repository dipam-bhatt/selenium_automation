package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnection {
	public WebDriver getConnection() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");    
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		return driver;

}
}