package November7_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_locators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("2000rutika@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Rutika@2000");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.partialLinkText("Create new ")).click();

	}

}
