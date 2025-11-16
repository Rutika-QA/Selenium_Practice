package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//checkboxes
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		WebElement checkbox = driver.findElement(By.cssSelector("input[id='checkBoxOption1']"));
		Thread.sleep(2000L);
		System.out.println("Starting the test...");
	
		if(!checkbox.isSelected()) {
			checkbox.click();
			System.out.println("Checkbox is selected now");
//			System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		}
//		else {
//			checkbox.click();
//			System.out.println("Checkbox is not selected");
//			System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
//		}
		
		// no. of checkboxes present in webpage
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		
	}

}
