package PracticeSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNo_2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement cusid = driver.findElement(By.name("cusid"));
		cusid.sendKeys("helo");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		Alert firstAlert = driver.switchTo().alert();
        System.out.println("First Alert Text: " + firstAlert.getText()); // Print the alert message
        firstAlert.accept();
        
        
        
	}

}
