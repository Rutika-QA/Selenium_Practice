package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("imp[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}

}
