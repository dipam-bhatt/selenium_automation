package assignment1;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnection;

// 12. W.a. junit program to perform test with webdriver to login process of facebook
public class Q12 {

	        static WebDriver driver;
            @Test
             public void fblogin() throws InterruptedException {
            	         driver.findElement(By.id("email")).sendKeys("dipambhatt425@gmail.com");
            	         driver.findElement(By.id("pass")).sendKeys("dipamdipam");
            	         driver.findElement(By.name("login")).click();
            	         Thread.sleep(7000);
            }
            @BeforeClass
             public static void beforeclass() {
            	         driver = new DriverConnection().getConnection();
            	         driver.get("https://www.facebook.com/");
            }
            @AfterClass
            public static void afterclass() throws InterruptedException {
            	       Thread.sleep(2000);
            	        driver.close();
            }
}


