package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment1 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Radio Button & Check Box Demo" ;
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is correct:" + actualTitle);
		}
		else {
			System.out.println("Title is incorrect:" + expectedTitle);
		}
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();	
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
		checkbox3.click();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement countryDropdown = driver.findElement(By.name("country"));
		Select select = new Select(countryDropdown); 
		select.selectByVisibleText("KUWAIT");
	}
}
