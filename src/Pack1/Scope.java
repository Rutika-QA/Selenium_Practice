package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		// links of 1st column
		
		WebElement footdriver = driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
		
		WebElement columndriver= footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		// 4- click on each link in the colunm and check if links are opening
		
		for (int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++) 
		{
			// tabs
			
			String clickonLinkTabs= Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTabs);
			Thread.sleep(5000L);
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it= windows.iterator();
			while(it.hasNext()) // iterator n gives title for all tabs
				
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		
		
	}

}
