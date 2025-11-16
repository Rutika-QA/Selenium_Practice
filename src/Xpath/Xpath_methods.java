package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("2000rutik@gmail.com");
		driver.findElement(By.xpath("//input[@id='email'and@name='email']")).sendKeys("2000rutik@gmail.com");
		driver.findElement(By.xpath("//input[@id='email'or@name='email']")).sendKeys("ruts");
		
		driver.findElement(By.xpath("//button"));
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		
		driver.quit();

	}

}
