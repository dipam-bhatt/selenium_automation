package Assessment;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import util.DriverConnection;

public class FormQA {
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
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new DriverConnection().getConnection();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Dipam");
		driver.findElement(By.id("lastName")).sendKeys("Bhatt");
		driver.findElement(By.id("userEmail")).sendKeys("dipam@google.com");
		driver.findElement(By.xpath("//label[text() ='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("65897465165");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement datepick = driver.findElement(By.id("dateOfBirthInput"));
		datepick.click();
		Thread.sleep(2000);
		
		WebElement years = driver.findElement(By.className("react-datepicker__year-select"));
		Select year = new Select(years);
		year.selectByVisibleText("1996");
		
		WebElement months = driver.findElement(By.className("react-datepicker__month-select"));
		Select month = new Select(months);
		month.selectByIndex(1);
		
		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[4]/div[5]"));
		date.click();
		
		WebElement sub = driver.findElement(By.xpath("//*[@id='subjectsWrapper']/div[2]/div/div/div[1]"));
		Actions action = new Actions(driver);
		action.click(sub)
		.sendKeys("Chemistry")
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.pause(Duration.ofSeconds(2))
//		.sendKeys("Physics")
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER)
		.build().perform();

		WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-1"));
		hobbies.click();
		
		WebElement upload = driver.findElement(By.id("uploadPicture"));
		upload.sendKeys("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\titleTest.png");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("currentAddress")).sendKeys("Manchester city");
		getScreenshot(driver, "C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\fbss.png");		
		System.out.println("ss taken");

	
		
	}

}
