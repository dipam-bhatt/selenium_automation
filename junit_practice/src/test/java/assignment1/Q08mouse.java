package assignment1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.DriverConnection;

// 8. W.A.J.Script To use Mouse and Keyboard event using Action class 
// 1. Mouse Hover Event
public class Q08mouse {
           public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new DriverConnection().getConnection("https://demo.guru99.com/test/newtours");
		   
		   WebElement home = driver.findElement(By.linkText("Home"));
		   WebElement flight = driver.findElement(By.linkText("Flights"));
		   WebElement hotel = driver.findElement(By.linkText("Hotels"));
		   WebElement cr = driver.findElement(By.linkText("Car Rentals"));
		   WebElement cruise = driver.findElement(By.linkText("Cruises"));
		   WebElement dest = driver.findElement(By.linkText("Destinations"));
		   WebElement vac = driver.findElement(By.linkText("Vacations"));

		   Actions action = new Actions(driver);
		   action.moveToElement(home).build().perform();
		   action.moveToElement(flight).build().perform();
		   action.moveToElement(hotel).build().perform();
		   action.moveToElement(cr).build().perform();
		   action.moveToElement(cruise).build().perform();
		   action.moveToElement(dest).build().perform();
		   action.moveToElement(vac).build().perform();
		   Thread.sleep(2000);
		   		   
		  driver.close();
		}
}



