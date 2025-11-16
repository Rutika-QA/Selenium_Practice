package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Dropdown {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
			
			//checkbox
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//			Assert.assertFalse(false);
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			// count the number of checkboxes
			
			 System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
			
			
			//dropdown 
			 
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			// //Tagname[@attribute='value'] --> //a[@value='BLR']
			
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			
	}

}
