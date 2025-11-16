package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Rutika Masne");
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys("2000rutika@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ruts789");
			driver.findElement(By.className("form-check-label")).click();
			// //Tagname[@attribute='value'][index]
			WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
			Select abc = new Select(dropdown);
			abc.selectByVisibleText("Female");
	}

}
