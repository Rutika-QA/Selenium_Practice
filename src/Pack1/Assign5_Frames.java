package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Nested Frames")).click();
			
			driver.switchTo().frame("frame-top");

			driver.switchTo().frame("frame-middle");
			System.out.println(driver.findElement(By.id("content")).getText());
			
			
	}

}
