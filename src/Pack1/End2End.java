package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class End2End {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
			//dropdown For to n from
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			// //Tagname[@attribute='value'] --> //a[@value='BLR']
			driver.findElement(By.xpath("//a[@value='DEL']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			
			//Calendar
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click(); // .classname -> not need spaces, please make it dot
		
			//Checkbox
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			
			// Enabled-Disabled 
			
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			{
				System.out.println("its disbled");
				Assert.assertTrue(true);
			}
			else 
			{
				Assert.assertTrue(false);
			}
			
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2000L);
			for(int i=1; i<5; i++) 
			{
				driver.findElement(By.id("hrefIncAdt")).click();
			}
			driver.findElement(By.id("btnclosepaxoption")).click();	
			//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
		
			//search
			//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();// #id
		//	driver.findElement(By.cssSelector("input[value='Search']")).click();
//			driver.findElement(By.xpath("//input[@type='Submit']")).click();
			driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
			
			

		}
}
