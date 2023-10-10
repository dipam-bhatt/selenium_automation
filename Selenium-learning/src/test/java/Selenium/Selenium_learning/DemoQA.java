package Selenium.Selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {
	public static void main(String[] args) throws InterruptedException{
		String url = "https://demoqa.com/automation-practice-form";
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);		
		
		driver.findElement(By.id("firstName")).sendKeys("Dipam");
        driver.findElement(By.id("lastName")).sendKeys("Bhatt");
        driver.findElement(By.id("userEmail")).sendKeys("java@selenium.com");
//        List<WebElement> gender = driver.findElements(By.name("gender"));
//        for (WebElement g : gender) {
//        	String name = g.getText();
//        	System.out.println(name);
//        }
//        	gender.get(0).click();
//        	Thread.sleep(3000);
         driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("2345678910");
//                driver.findElement(By.id("dateOfBirthInput")).click();
//                driver.findElement(By.className("react-datepicker__year-select"));
//                Select yearDropdown = null;
//				yearDropdown.selectByVisibleText("1996");
//                driver.findElement(By.className("react-datepicker__month-select"));
//                Select monthDropdown = null;
//				monthDropdown.selectByVisibleText("February");
        
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
 	   month.selectByIndex(4);
 	   
 	   WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__month']/div[2]/div[1]"));
 	   date.click();
                driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
                driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
                driver.findElement(By.id("currentAddress")).sendKeys("manchester city");
                driver.findElement(By.id("state")).click();
                driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div/svg")).click();
                driver.findElement(By.id("city")).click();
                driver.findElement(By.xpath("//div[text()='Delhi']")).click();
                driver.findElement(By.id("submit")).click();


            }
        }
     	

