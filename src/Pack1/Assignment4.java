package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/");
			//1st
			driver.findElement(By.linkText("Multiple Windows")).click();
			//2nd
			driver.findElement(By.linkText("Click Here")).click();
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it =windows.iterator();
			String parentId = it.next();
			String childId = it.next();
			driver.switchTo().window(childId);
			//output 3rd
			System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
			//o/p 4th
			driver.switchTo().window(parentId);
			System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
	}

}
