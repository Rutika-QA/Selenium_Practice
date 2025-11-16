package Pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		// Enter customerId
		WebElement customerIdInput = driver.findElement(By.name("cusid"));
        customerIdInput.sendKeys("12345");
		
		//Click on Submit
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
		
		//One prompt will open click on ok
        Alert firstAlert = driver.switchTo().alert();
        System.out.println("First Alert Text: " + firstAlert.getText()); // Print the alert message
        firstAlert.accept();
		
		Alert secondAlert = driver.switchTo().alert();
        System.out.println("Second Alert Text: " + secondAlert.getText()); // Print the alert message
        secondAlert.accept();

 
	}
}
