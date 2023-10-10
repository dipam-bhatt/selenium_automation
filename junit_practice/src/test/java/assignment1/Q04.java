package assignment1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

// 4. W.A.J.script to register your self in Gmail.

public class Q04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new DriverConnection().getConnection("https://accounts.google.com/signup");

		driver.findElement(By.id("firstName")).sendKeys("Dipam");
		driver.findElement(By.id("lastName")).sendKeys("Bhatt");
		WebElement next = driver.findElement(By.xpath("//div[@id=\"collectNameNext\"]/div/button/span"));
		next.click();
		Thread.sleep(1000);

		driver.findElement(By.id("day")).sendKeys("22");
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByVisibleText("February");
		driver.findElement(By.id("year")).sendKeys("1996");

		WebElement g = driver.findElement(By.id("gender"));
		Select gender = new Select(g);
		gender.selectByVisibleText("Male");
		Thread.sleep(1000);

		WebElement next1 = driver.findElement(By.xpath("//div[@id='birthdaygenderNext']/div/button/span"));
		next1.click();
		List<WebElement> emails = driver.findElements(By.xpath("//div[@class='enBDyd ']"));
		System.out.println(emails.size());
		for (WebElement id : emails) {
			emails.get(1).click();
			Thread.sleep(1000);

		}
	}
}




