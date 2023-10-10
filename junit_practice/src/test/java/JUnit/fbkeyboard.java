package JUnit;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.DriverConnection;

public class fbkeyboard {
        public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new DriverConnection().getConnection("https://www.facebook.com/");
		   WebElement id = driver.findElement(By.id("email"));
		   Actions action1 = new Actions(driver);
		   action1.click(id)
		               .keyDown(Keys.SHIFT)
		               .sendKeys("hello").keyUp(Keys.SHIFT).pause(Duration.ofSeconds(2))
		               .doubleClick(id)
		               .pause(Duration.ofSeconds(2))
		               .contextClick()
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys (Keys.ENTER)
		               .build().perform();
		   WebElement pwd = driver.findElement(By.id("pass"));
		   Actions action2 = new Actions(driver);
		   action2.click(pwd)
		               .pause(Duration.ofSeconds(2))
		               .contextClick()
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ARROW_DOWN)
		               .sendKeys(Keys.ENTER)
		               .build().perform();
		   Thread.sleep(2000);
        }		     
}


