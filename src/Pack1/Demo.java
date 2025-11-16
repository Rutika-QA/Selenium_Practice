package Pack1;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		
		// compare original list vs sorted list
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		// click on column
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/th[1]"));
		
		// Capture all Webelements into lists
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// Sort in the list for step 3-> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		//scan the name column with getText -> print the price of the Beans
		do {
			
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = elementList.stream().filter(s->s.getText().contains("Rice")).
		map(s->getPriceveggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		
		}while(price.size()<1);
	}
	
	private static String getPriceveggie(WebElement s)
	{
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
		
	}
}
