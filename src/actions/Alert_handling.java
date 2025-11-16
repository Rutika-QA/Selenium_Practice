package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.id("aleartButton")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert all = driver.switchTo().alert();
		Thread.sleep(3000);
		all.dismiss();
	}

}
