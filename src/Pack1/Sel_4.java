package Pack1;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//new window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
	
		
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentId);
		
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);
		
		File file = name.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(file, new File("logo.png"));
//		
		// ScreenShot of WebElement 
		
		
		//Get Height & Weight
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
	}

}
