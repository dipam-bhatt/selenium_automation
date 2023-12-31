package assignment1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.DriverConnection;

// 1. W.A.J.Script for Locating links by linkText() and partialLinkText()

public class Q01 {
           public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new DriverConnection().getConnection("https://www.globalsqa.com/demo-site/datepicker/");
		   
//		   WebElement ele = driver.findElement(By.linkText("facebook"));
//		   ele.click();
//		   Thread.sleep(2000);
		   
		   List<WebElement> list = driver.findElements(By.partialLinkText("face"));
		   for(WebElement link : list) {
			     System.out.println(link.getText());
		   }
		   System.out.println(list.size());
		   list.get(0).click();
		   Thread.sleep(2000);
		   driver.navigate().back();
		}
}




