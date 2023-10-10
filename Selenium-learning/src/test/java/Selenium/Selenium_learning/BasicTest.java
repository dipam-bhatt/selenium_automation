package Selenium.Selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicTest {
 public static void main(String[] args) {
	String url ="https:www.facebook.com/";
	System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	    driver.get(url);

	
	
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Documents\\msedgedriver.exe");
//	WebDriver driver = new EdgeDriver();
//	driver.manage().window().maximize();
//	driver.get(url);
//	
//	
//	String expectedresult="facebook.com";
//	String actual = driver.getTitle();
//	System.out.println(actual);
//	if(expectedresult.equals(actual)) {
//		System.out.println("pass");
//	}
//	else {
//		System.out.println("fail");
//	}
//	WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("selenium@gmail.com");
//	WebElement password = driver.findElement(By.id("pass"));
//	password.sendKeys("pass");
//	
	
}
}
