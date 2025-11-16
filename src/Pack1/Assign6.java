package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://qaclickacademy.com/practice.php");
			//select any checkbox
			driver.findElement(By.id("checkBoxOption2")).click();
			// grab the name of selected checkbox
			
			String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
			WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
			Select s=new Select(dropdown);
			s.selectByVisibleText(opt);
			
			driver.findElement(By.name("enter-name")).sendKeys(opt);
			
	}

}
