package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_actions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello All..Morning");
		 Thread.sleep(3000);
		 Actions a = new Actions(driver);
		 a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		 a.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		 
		 a.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 a.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		

	}

}
