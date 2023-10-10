package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FbparaLogin {
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser() {
		driver = new DriverConnection().getConnection();
		driver.get("https://www.facebook.com/");
	}
	@Test(dataProvider = "ds")
	public void test(String email, String pass) {
		WebElement email1 = driver.findElement(By.id("email"));
		email1.clear();
		email1.sendKeys(email);
		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.clear();
		pass1.sendKeys(pass);
	}
	@DataProvider(name = "ds")
	public static Object[][] dataProviderMethod(){
		Object[][] obj = new Object[2][2];
		
		obj[0][0] = "bhattdipam@yahoo.com";
		obj[0][1] = "bhattdipam@yahoo.com";
		
		obj[1][0] = "bhattdipam@yahoog.com";
		obj[1][1] = "bhattdipam@yahoogg.com";
		return obj;
	}
@AfterClass
public static void closeBrowser() {
	driver.close();
}
}
