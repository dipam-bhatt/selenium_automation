package Selenium.Selenium_learning;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FbScreenshot {
    public static void getScreenshot(WebDriver driver,String path) {
        TakesScreenshot ss = (TakesScreenshot)driver;
        File source = ss.getScreenshotAs(OutputType.FILE);
        File dest = new File(path);
        try {
			    FileUtils.copyFile(source, dest);
			    System.out.println("ss taken");
		} catch (Exception e) {
			    e.printStackTrace();
		}
}
public static void main(String[] args) {
	

String url = "https://www.facebook.com/";
WebDriver driver = new DriverConnection().getConnection(url);
Thread.sleep(2000);
System.out.println("method called");
//driver.findElement(By.id("email")).sendKeys("can@gmail.com");
driver.findElement(By.id("email")).sendKeys("dipambhatt425@gmail.com");
driver.findElement(By.id("pass")).sendKeys("123456789");
driver.findElement(By.xpath("//div[@class='_6ltg']/button")).click();
Thread.sleep(2000);
getScreenshot(driver, "C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\fbss.png");
System.out.println("done");
   
}
}


