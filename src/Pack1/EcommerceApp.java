package Pack1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Expected Array
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		// list of webElemnts
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Cauliflower"};
		
		
		Thread.sleep(3000);
		EcommerceApp e = new EcommerceApp();
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("imp[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy"); // ---> tagname.classname
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		
		}
		
	public static void addItems(ChromeDriver driver ,String[] itemsNeeded) {
		int j = 0;
	
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<products.size(); i++) 
		{
			//Brocolli - 1 Kg
			// Brocolli 0th index , 1kg 1st index
			// so string becomes array, realize that there is space
			
			String[] name = products.get(i).getText().split("-");
			String formattedNmae = name[0].trim();
			// format it  to get actual vegetable --> split it
			
			// Goal : Check whether name you extracted is present in arraylist or not
			// step 1: convert array into arraylist [used ->Arrays.asList(itemsNeeded) ]
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedNmae))
			{
				//click on Add to cart
				driver.findElements(By.xpath("//button[@text='ADD TO CART']")).get(i).click();
				//driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break;// cannot use breakn --> becoz we need no of elements
				if(j==3) {
					break;
				}
			}
		}
	}
		
	}


