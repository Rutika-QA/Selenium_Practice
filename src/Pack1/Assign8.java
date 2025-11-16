package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> Autodrop = driver.findElements(By.cssSelector("li[class='ui-menu-item-wrapper'] a"));
		for(WebElement Autodrops :Autodrop) 
		{
			if(Autodrops.getText().equalsIgnoreCase("India")) {
				Autodrops.click();
				break;
			}
		}
	}

}