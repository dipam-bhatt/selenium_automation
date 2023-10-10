package BrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TopsTest {
	@Parameters("browser")
	@Test
	public void test(String browser) {
			WebDriver driver = null;
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if (browser.equals("gecko")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\OneDrive\\Documents\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			if (browser.equals("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\OneDrive\\Documents\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			driver.get("https://careercenter.tops-int.com/");
}
}
