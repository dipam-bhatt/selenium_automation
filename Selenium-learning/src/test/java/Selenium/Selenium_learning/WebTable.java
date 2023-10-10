package Selenium.Selenium_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new DriverConnection().getConnection(url);
		WebElement ele = driver.findElement(By.xpath("// table[@id='customers']/tbody/tr[4]/td[3]/span"));
		System.out.println("ele : >< " + ele.getText());

		for (int r = 1; r <= 3; r++) {
			WebElement ele1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/th[" + r + "]/span"));
			System.out.print(ele1.getText() + " ");
		}
		System.out.println();
		for (int r = 2; r <= 7; r++) {
			for (int c = 1; c <= 3; c++) {
				WebElement ele1 = driver
						.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + r + "]/td[" + c + "]/span"));
				System.out.print(ele1.getText() + " ");
			}
			System.out.println();
		}

	}

}
