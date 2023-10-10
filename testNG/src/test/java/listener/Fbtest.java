package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class Fbtest {
@Test
public void titleTest(ITestContext i) {
	WebDriver driver = new DriverConnection().getConnection();
	driver.get("https://www.facebook.com/");
	i.setAttribute("myDriver", driver);
			assertEquals(driver.getTitle(), "FB");
			
}
}
