package assignment1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// 13. W.a. junit program to check gmail login using with @before,@after,@Test
public class Q13 {
	        static WebDriver driver;
            @Before
            public void beforetest() {
            	        driver = new DriverConnection().getConnection();
            	        driver.get("https://accounts.google.com/");
            }
            @Test
            public void glogin() throws InterruptedException {
            	        driver.findElement(By.id("identifierId")).sendKeys("dipambhatt425@gmail.com");
            	        driver.findElement(By.xpath("//div[@id='identifierNext']/div/button/span")).click();
            	        Thread.sleep(4000);
            	        driver.findElement(By.id("password")).sendKeys("dipamdipam");
            	        driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/span")).click();
            	        Thread.sleep(5000);
            }
            @After
            public void aftertest() throws InterruptedException {
            	        Thread.sleep(2000);
            	        driver.close();
            }
         
}




