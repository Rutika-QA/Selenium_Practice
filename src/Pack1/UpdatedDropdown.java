package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		/*
		 int i = 1;
	     while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
			i++;
		}
		*/
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();	
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		// Enabled-Disabled 
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
		
		}
	
	}

