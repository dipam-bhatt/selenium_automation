package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

// 5. W.A.J. Script To perform the radio button to select one by one in loop http://demo.guru99.com/test/radio.html
public class Q05 {
           public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new DriverConnection().getConnection("http://demo.guru99.com/test/radio.html");
		   
		   WebElement r1 = driver.findElement(By.id("vfb-7-1"));
		   r1.click();
		   Thread.sleep(1000);
		   WebElement r2 = driver.findElement(By.id("vfb-7-2"));
		   r2.click();
		   Thread.sleep(1000);
		   WebElement r3 = driver.findElement(By.id("vfb-7-3"));
		   r3.click();
		   
		   driver.quit();
		}
}




