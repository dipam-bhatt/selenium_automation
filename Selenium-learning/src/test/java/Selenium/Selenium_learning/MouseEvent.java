package Selenium.Selenium_learning;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Selenium.Selenium_learning.DriverConnection;

public class MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		String url= "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = new DriverConnection().getConnection(url);
		 WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		 driver.switchTo().frame(iframe);
		  WebElement from = driver.findElement(By.xpath("//*[@id='gallery']/li[1]/ing"));
		  WebElement to =driver.findElement(By.id("trash"));
		  Thread.sleep(3000);
		  Actions action = new Actions(driver);
		 
		
		
		
		
		
		
		
//		WebElement miniTV = driver.findElement(By.linkText("Amazon miniTV"));
//		WebElement sell = driver.findElement(By.linkText("Sell"));
//		WebElement bs = driver.findElement(By.linkText("Best Sellers"));
//		WebElement td = driver.findElement(By.linkText("Today's Deals"));
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(miniTV).build().perform();
//		action.moveToElement(sell).build().perform();
//		action.moveToElement(bs).build().perform();
//		action.moveToElement(td).build().perform();
//		Thread.sleep(3000);
//		
//		driver.close();
	}

}
