package Selenium.Selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FBTest {
	public static void main(String[] args) throws InterruptedException{
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getConnection(url);
		
		WebElement ele = driver.findElement(By.linkText("Create new account"));
		ele.click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Dipam");
		driver.findElement(By.name("lastname")).sendKeys("Bhatt");
		driver.findElement(By.name("reg_email__")).sendKeys("987654321");
		driver.findElement(By.name("reg_passwd__")).sendKeys("selenium@456");
		
		WebElement dates= driver.findElement(By.id("day"));
		Select date = new Select(dates);
		date.selectByIndex(2);
		
		WebElement months = driver.findElement(By.id("month"));
		Select month = new Select(months);
		month.selectByValue("4");
		
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByVisibleText("2010");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		for (WebElement g:gender) {
			String name = g.getText();
			System.out.println(name);
		}
		gender.get(1).click();

		WebElement signupButtonElement = driver.findElement(By.name("websubmit"));
		signupButtonElement.click();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
