package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentNo_3 {
		
		ChromeDriver driver = new ChromeDriver();
		
		@BeforeTest
	    public void setup() throws InterruptedException {  
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/test/login.html");
	        Thread.sleep(3000);
	}
		@Test(dataProvider = "loginData")
			public void loginTest(String username, String password) throws InterruptedException {
			Thread.sleep(3000);
			WebElement emailFeild = driver.findElement(By.id("email"));
			WebElement passwordField = driver.findElement(By.id("passwd"));
			WebElement loginButton = driver.findElement(By.id("SubmitLogin"));
			
			
			emailFeild.sendKeys(username); 
	        passwordField.sendKeys(password);  
	        loginButton.click();
		}
		
		@DataProvider(name = "loginData")
	    public Object[][] getData() throws InterruptedException {
			Thread.sleep(3000);
	        return new Object[][]{
	            {"smandape06@gmail.com", "logindata"}
	        };
	    }
		 @AfterClass
		    public void afterclass() throws InterruptedException {
			 Thread.sleep(3000);
		        driver.close();
		    }

}
