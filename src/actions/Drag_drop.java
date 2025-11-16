package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	 Thread.sleep(3000);
	 WebElement osloBox = driver.findElement(By.id("box1"));
	 WebElement norway = driver.findElement(By.id("box101"));
	 Actions a = new Actions(driver);
	 Thread.sleep(3000);
	 a.dragAndDrop(osloBox, norway).build().perform();
	 Thread.sleep(3000);
	 driver.close();
	}

}
