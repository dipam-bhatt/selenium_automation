package Assessment;

import org.openqa.selenium.WebDriver;

import DriverConnection.DriverConnect;

//Task 3 : Find the tallest structure in the table with Selenium
public class Webtable {
	public static void main(String[] args) {
		WebDriver driver = new DriverConnect().getConnection("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
	}

}
