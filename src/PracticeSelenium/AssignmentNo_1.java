package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentNo_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html"); // launching URL
		driver.manage().window().maximize(); // 
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Radio Button & Check Box Demo" ;
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct : "+ actualTitle);
		}
		else {
			System.out.println("Title is incoreect" + expectedTitle);
			
		}
		
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();
		
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		checkbox3.click();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js = (JavascriptExecutor)driver; // for window scrolling
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select s = new Select(countryDropdown);
		s.selectByVisibleText("KUWAIT");
		
		driver.quit(); // close all tabs
		
		
	}

}
