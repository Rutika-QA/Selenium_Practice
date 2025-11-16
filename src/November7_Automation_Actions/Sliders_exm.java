package November7_Automation_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders_exm {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
		WebElement min_button = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println(min_button.getLocation());
		act.dragAndDropBy(min_button, 100, 0).perform();
		Thread.sleep(5000);
		System.out.println("After operation "+min_button.getLocation());
	}

}
