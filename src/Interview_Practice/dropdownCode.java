package Interview_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownCode {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
    driver.manage().window().maximize();
    
    
    WebElement courseDropdown = driver.findElement(By.id("course"));
    
    Select select = new Select(courseDropdown);
    
    select.selectByVisibleText("Java");
    
    Thread.sleep(2000);
    
    driver.quit();
    
    
	}

}
