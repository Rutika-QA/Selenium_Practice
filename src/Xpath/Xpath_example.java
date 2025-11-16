package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		driver.quit();
		
	}

}
