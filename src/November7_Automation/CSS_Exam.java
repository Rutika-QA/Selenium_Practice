package November7_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Exam {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
//		 driver.findElement(By.cssSelector("input#email")).sendKeys("2000rtuika@gmail.com");
		 driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("2000ruika@gmail.com");
		 driver.findElement(By.cssSelector("input._9npi")).sendKeys("Rutika@2000");

	}
	
	// if there is space in classname then it should cover with dot

}
