package Selenium.Selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new DriverConnection().getConnection(url);
	WebElement ele = driver.findElement(By.className("tsc_table_s13"));


		
		        List<WebElement> heightElements = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th[4]")); 

		        int maxHeight = 0;
		        String tallestStructure = null;

		        for (WebElement element : heightElements) {
		            int height = Integer.parseInt(element.getText().replaceAll("", "")); 
		            System.out.println("error");
		            if (height > maxHeight) {
		                maxHeight = height;
		                tallestStructure = element.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody")).getText(); 
		            }
		        }

		        
		        System.out.println("Tallest Structure: " + tallestStructure);
		        System.out.println("Height: " + maxHeight + "m");

		     
		    }
		}


		


