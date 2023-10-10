package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DriverConnection.DriverConnect;

public class DataDriven {
	 WebDriver driver;
	 @BeforeClass
	 public void openBrowser () {
		 driver = new DriverConnect().getConnection("https://www.facebook.com/");
}
	 @Test (dataProvider = "dp")
	 public void logintest(String email, String pass)
	 {
		 System.out.println(email+ " "+pass);
		 WebElement username = driver.findElement(By.id("email"));
		 username.clear();
		 username.sendKeys(email);
		 WebElement password = driver.findElement(By.id("pass"));
		 password.clear();
		 password.sendKeys(pass);
	 }
	 @DataProvider(name = "dp")
	 public static Object [][] data(){
		 excelreader ex = new excelreader("location :C:\\Users\\HP\\OneDrive\\Desktop\\HLR (1).xlsx", "login");
		 int row = ex.rowCount();
		 int col = ex.colCOunt();
		 
		 Object obj [][] = new Object[row-1][col];
		 
		 for (int i=1;i<row;i++)
		 {
			 for(int j=0;j<col;j++)
			 {
				 String data = ex.getData(i, j);
				 obj[i-1][j] = data;
			 }
		 }
		 
		 return obj;
	 }
}
