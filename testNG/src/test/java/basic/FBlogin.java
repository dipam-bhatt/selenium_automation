package basic;


	import java.sql.Driver;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import Util.DriverConnection;

	public class FBlogin {
	    WebDriver driver;
	    String URL = "https://www.facebook.com/";

	    @BeforeTest
	    public static void beforeClass () {
			try {
				driver = new DriverConnection().getConnection("https://www.facebook.com/");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	    @Test
	    public void loginToFacebook() {
	        // Navigate to Facebook
	        driver.get(URL);
	        
	        // Locate the email/phone input field and enter your email/phone number
	        WebElement email = driver.findElement(By.id("email"));
	        email.sendKeys("your_email_or_phone");
	        
	        // Locate the password input field and enter your password
	        WebElement password = driver.findElement(By.id("pass"));
	        password.sendKeys("your_password");
	        
	        // Locate the login button and click it
	        WebElement login = driver.findElement(By.name("login"));
	        login.click();
	        
	        // Wait for the login to complete (you can add explicit waits here)
	        
	        // Assertion: Check if the login was successful by verifying a page element on the dashboard
	        WebElement dashboardElement = driver.findElement(By.xpath("//div[@id='pagelet_bluebar']"));
	        assert dashboardElement.isDisplayed() : "Login failed!";
	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the WebDriver session
	        driver.quit();
	    }
	}


