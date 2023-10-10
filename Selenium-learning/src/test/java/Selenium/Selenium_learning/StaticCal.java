package Selenium.Selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticCal {
public static void main(String[] args) throws InterruptedException {
	String url= "https://www.globalsqa.com/demo-site/datepicker/";
	WebDriver driver = new DriverConnection().getConnection(url);
	WebElement iframe = driver.findElement(By.xpath("//div[@class='resp-tabs-container']/div[1]/p/iframe"));
	System.out.println("frame fatched");
	driver.switchTo().frame(iframe);
	System.out.println("swtiched to frame");
	Thread.sleep(2000);
	WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
	datepick.click();
	Thread.sleep(2000);
	String myDate ="22";
	String myMonth = "February";
	String myYear = "1996";
	String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	int y1 = Integer.parseInt(myYear);
	int y2 = Integer.parseInt(currentyear);
	while(!myYear.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText())) {
//		WebElement prev = driver.findElement(By.xpath("//a[@data-handler='prev']/span"));
		if(y1>y2) {
			driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
		}
		else {
			driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
		}
	}
	while(!myMonth.equals(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText())) {
		if(y1>y2) {
			driver.findElement(By.xpath("//a[@data-handler='next']/span")).click();
		}
		else {
			driver.findElement(By.xpath("//a[@data-handler='prev']/span")).click();
		}
	}
	
	List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
	for(WebElement date:dates) {
		String d = date.getText();
		System.out.println(d+" / "+myMonth+" / "+myYear);
		if(d.equals(myDate)) {
			date.click();
		}
	}
	
	
	
//	WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker']"));
//	datepick.click();
//	WebElement cdate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[4]"));
//	System.out.println(cdate.getText());
//	WebElement cdate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[r]/td[c]"));
//  while (true) {
//	  List<WebElement> dateElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
//	  
//
//	for (WebElement d : dateElements) {
//		  WebElement dateText = ((WebElement) dateElements);
//		  System.out.println(dateText);
//		  
//	  }
//  }
//     List<WebElement> dateElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
//     for (WebElement dateElement : dateElements) {
//         String dateText = dateElement.getText();
//         System.out.println(dateText);
//     }
	
}
}

