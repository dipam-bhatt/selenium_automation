package Selenium.Selenium_learning;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class WindowHandle {
	public static void main(String[] args) throws InterruptedException {	
String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = new DriverConnection().getConnection(url);	
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);		
		WebElement ele  = driver.findElement(By.linkText("Click Here"));
		ele.click();	
	 	Set<String> allWin = driver.getWindowHandles();
		for(String win: allWin) {
			System.out.println(win);
			if(!win.equals(mainWin)) {
				driver.switchTo().window(win);
			}
		}	
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("selenium@gmail.com");		
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainWin);
		driver.close(); 
//		driver.quit();
	}
}

