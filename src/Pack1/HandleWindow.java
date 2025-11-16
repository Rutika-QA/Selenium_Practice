package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	// How to handle child windows n how to switch from parent to child windows
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		// .classname -> CSS
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		// we can get the Ids of windows
		Set<String> windows = driver.getWindowHandles(); // [parentId , childId, subChilId]
		Iterator<String> it =  windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		//.classname -> CSS {make sure when u are writing CSS of classname replace space to dot in classname}
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		// Back to parent page from child page
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
	}

}
