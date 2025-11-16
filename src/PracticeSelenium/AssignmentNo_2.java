package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ChromeDriver driver = new ChromeDriver(); // launching browser
//		driver.get("https://demo.guru99.com/test/web-table-element.php");
//		List<WebElement> countries = driver.findElements(By.xpath("table[@class='dataTable']/tbody/tr/td[1]/a"));		
//		for(WebElement company : countries) {
//			System.out.println(company.getText());
//		
//		}
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//Retrieve the all company names from the table
		
		List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		
		for(WebElement company : companyNames) {
			System.out.println(company.getText());
		}
	}

}
