package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateofBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).above(dateofBirth)).click();
		
		WebElement icecream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
		
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
	}

}
