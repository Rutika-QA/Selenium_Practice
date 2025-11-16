package SeleniumPractice2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String [] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("2000rutika@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("ruta@2000");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rutika");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("200rutika@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("2000rutika@gmail.com");
		
		
		
	}
}
/*
 CSS Selector - tagname.classname
 Practice ImplicitWait - driver.manage().timeouts().implicitWait(Duration.ofSeconds(5));
 Locator -> LinkText
 xpath
 cssSelector
 xpath with index
 CSS Selector with index
*/