package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;


public class ParametersTest {
	@Parameters({"email","pass"})
	@Test
	public void login(String email, String pass) {
		WebDriver driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/");
		
		WebElement email1 = driver.findElement(By.id("email"));
		email1.clear();
		email1.sendKeys(email);
		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.clear();
		pass1.sendKeys(pass);
	}

}
