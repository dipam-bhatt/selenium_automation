package assignment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.DriverConnection;


// 17. W.a. TestNG program to use parameterized demo with multiple parameter of Facebook login with TestNG

public class Q17 {
	WebDriver driver = null;
	        @BeforeClass
            public void beforeclass() {
            	        driver = new DriverConnection().getConnection();
            	        driver.get("https://www.facebook.com/");
            }
	        @AfterClass
	        public void afterclass() {
	        	        driver.close();
	        }
	        @Test (dataProvider = "dp")
	        public void login(String email, String pass) {
	        	        WebElement ele = driver.findElement(By.id("email"));
	        	        ele.clear();
	        	        ele.sendKeys(email);
	        	        WebElement ele2 = driver.findElement(By.id("pass"));
	        	        ele2.clear();
	        	        ele2.sendKeys(pass);
	        }
	        @DataProvider (name = "dp")
	        public static Object[][] method() {
	        	         Object [][] o = new Object [4][2];
	        	         
	        	         o[0][0] = "java@gmail.com";
	        	         o[0][1] = "java@123"	;
	        	         
	        	         o[1][0] = "selenium@gmail.com";
	        	         o[1][1] = "selenium@123"	;
	        	         
	        	         o[2][0] = "junit@gmail.com";
	        	         o[2][1] = "junit@123"	;
	        	         
	        	         o[3][0] = "testng@gmail.com";
	        	         o[3][1] = "testng@123"	;
						return o;
	        }
}



