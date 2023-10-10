package Selenium.Selenium_learning;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Box {
	public static void main(String[] args) throws InterruptedException{
		String url = "https://demoqa.com/alerts";
		WebDriver driver = new DriverConnection().getConnection(url);
	//	1.Alert 
		WebElement alertButton = driver.findElement(By.id("alertButton"));
		alertButton.click();
		System.out.println("alert button clicked");
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		
	//	2.Alert
		WebDriver wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement alertButtonElement = driver.findElement(By.id("timeAlertButton"));
		alertButton.click();
		Thread.sleep(7000);
		Wait
		
		
		//3.alert
		WebElement alertButton = driver.findElement(By.id("confirmButton"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
	}

} 