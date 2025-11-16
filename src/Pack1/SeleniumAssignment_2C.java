package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment_2C {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.linkText("Draggable")).click();
	
}
}
