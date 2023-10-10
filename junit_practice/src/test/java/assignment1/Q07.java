package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Util.DriverConnection;

// 7. W.A.J.Script To write a script for drop down. https://demo.guru99.com/test/newtours/register.php
public class Q07 {
            public static void main(String[] args) {
			WebDriver driver = new DriverConnection().getConnection("https://demo.guru99.com/test/newtours/register.php");
			WebElement country = driver.findElement(By.name("country"));
			Select option = new Select(country);
			option.selectByValue("UNITED STATES");
			
			driver.close();
			}
}




