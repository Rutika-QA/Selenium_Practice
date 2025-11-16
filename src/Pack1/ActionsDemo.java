package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=9010887704946334875&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
			Actions a = new Actions(driver);
			WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
			//Moves to specific Element
			a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
			// doubleclick
			a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			// rightclick -> 
			a.moveToElement(move).contextClick().build().perform();
			//Drag n drop
			
			
			
	}

}
