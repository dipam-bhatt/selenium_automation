package Selenium.Selenium_learning;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType; 
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public static void getScreenShot(WebDriver driver, String path) {
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
	public static void main(String[] args) throws InterruptedException {
	 String url = "https://www.facebook.com/";
	 WebDriver driver = new DriverConnection().getConnection(url);
	 Thread.sleep(2000);
	 System.out.println("method called");
	 getScreenShot(driver, "C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\myss.png");
	 System.out.println("done");
	 Thread.sleep(2000);
	}

}
