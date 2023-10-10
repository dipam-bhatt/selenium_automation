package Selenium.Selenium_learning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assi0012 {
	public static void main(String[] args) {
			        // Set the path to the ChromeDriver executable
		        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		        // Create a new instance of ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the sign-up page
		        driver.get("https://phptravels.org/register.php");

		        // Find and fill in the sign-up form fields
		        WebElement firstNameInput = driver.findElement(By.name("firstname"));
		        WebElement lastNameInput = driver.findElement(By.name("lastname"));
		        WebElement emailInput = driver.findElement(By.name("email"));
		        WebElement passwordInput = driver.findElement(By.name("password"));
		        WebElement confirmPasswordInput = driver.findElement(By.name("confirmpassword"));
		        WebElement signUpButton = driver.findElement(By.xpath("//button[@type='submit']"));

		        firstNameInput.sendKeys("John");
		        lastNameInput.sendKeys("Doe");
		        emailInput.sendKeys("johndoe@example.com");
		        passwordInput.sendKeys("password123");
		        confirmPasswordInput.sendKeys("password123");

		        // Click the sign-up button
		        signUpButton.click();

		        // Wait for a while to see the result before closing the browser
		        try {
		            Thread.sleep(5000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		        driver.quit();
		    }
		}

	
