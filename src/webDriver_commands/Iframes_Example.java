package webDriver_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Example {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://ui.vision/demo/webtest/frames/");
	    Thread.sleep(3000);
	    //frame 1
	    
	    WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	    driver.switchTo().frame(frame1);
	    driver.findElement(By.name("mytext1")).sendKeys("hi all");
	    driver.switchTo().defaultContent();
	    
	    //frame2
	    
	    WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.name("mytext2")).sendKeys("Good morning");
	    driver.switchTo().defaultContent();
	    
	    //frame 3
	    
	    
	    
	}

}
