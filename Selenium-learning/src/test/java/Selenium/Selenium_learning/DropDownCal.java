package Selenium.Selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownCal {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        // Open the provided URL
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");

        driver.findElement(By.id("DropDown DatePicker")).click();
        
    }
}




