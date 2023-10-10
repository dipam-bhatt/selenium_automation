package assignment1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.DriverConnection;

// 3. W.A.J. script to use different methods to manage the windows-alerts and pop ups.

public class Q03 {
            public static void main(String[] args) throws InterruptedException {
		    WebDriver driver = new DriverConnection().getConnection("https://demoqa.com/alerts");
		 
		    // 1. Alert button
		    
			WebElement alertButton = driver.findElement(By.id("alertButton"));
			alertButton.click();
			
			Alert alert = driver.switchTo().alert();
			Thread.sleep(2000);
			alert.accept();
			
			// 2. Timer alert 
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement alertButton1 = driver.findElement(By.id("timerAlertButton"));
			alertButton1.click();
			Thread.sleep(7000);
			wait.until(ExpectedConditions.alertIsPresent());
			
			Alert alert1 = driver.switchTo().alert();
			alert1.accept();
			Thread.sleep(2000);
			
			// 3. Confirm alert
			
			WebElement alertButton2 = driver.findElement(By.id("confirmButton"));
			alertButton2.click();
			Thread.sleep(2000);
			
			Alert alert2 = driver.switchTo().alert();
			alert2.dismiss();
			Thread.sleep(2000);
			
			// 4. Promt alert
			
			WebElement alertButton3 = driver.findElement(By.id("promtButton"));
			alertButton3.click();
			
			Alert alert3 = driver.switchTo().alert();
			alert3.sendKeys("enter text here");
			Thread.sleep(2000);
			alert3.accept();
		}
}


	


