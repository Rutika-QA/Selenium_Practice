package Pack1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Incorrect Details
//		ChromeDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver1 = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://nt-dev.noodletools.com/logon/signin");
		driver.findElement(By.cssSelector("input[placeholder='Personal ID']")).sendKeys("rushi");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("technology");
		driver.findElement(By.cssSelector("button[title='Sign In']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.text-left")).getText());
		
		// Forgot password 
	
		driver.findElement(By.linkText("Forgot Password?")).click(); //--> Link Text Locator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Personal ID']")).sendKeys("rushi2");
		driver.findElement(By.cssSelector("input[placeholder='Personal ID']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Personal ID']")).sendKeys("rushi2");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number (last 4 digit)']")).sendKeys("8666");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number (last 4 digit)']")).clear();
		driver.findElement(By.xpath("//div/input[2]")).sendKeys("8666");
		driver.findElement(By.cssSelector("button[title='Retrive password']")).click();
		driver.findElement(By.cssSelector("button[title='Your password hint']")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class='text-[13px]']")).getText());
		System.out.println(driver.findElement(By.cssSelector("p[title='t--h']")).getText());
		driver.findElement(By.xpath("//button[@title='Sign in']")).click();
	
		
		// With correct details
		
		driver.findElement(By.cssSelector("input[placeholder='Personal ID']")).sendKeys("rushi2");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("tech");
		driver.findElement(By.cssSelector("label[title='Remember me']")).click();
		driver.findElement(By.cssSelector("button[title='Sign In']")).click();
		
		
		
		 
		
/* CSS selector :
 		Class name -> tagname.classname -> Button.signInBtn -> .error
		Tagname[attribute='value']
		attribute='value'
		ID -> tagname#id -> #inputUsername
		input[placeholder='Personal ID']
		Tagname[@attribute='value']:nth-child(index) - child items
		parentTagname childtagname -> div 
		Regular Expression -> Tagname[attribute*='pass'] -> when some digits are dynamic
		.classname/id  -> if there are spaces in classname, u have to delete it and add dot
		
	Xpath creation:
		 //Tagname[@attribute='value']
		 //Tagname[@attribute='value'][index]
		 //div/h3
		 //div/input[2] --> parentTagname/childTagname
		 //tagname
		 
*/
		
		
		
		
	}

}
