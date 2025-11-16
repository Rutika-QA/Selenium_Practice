package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	// 
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("http://google.com"); // it will wait till whole page is loaded
	driver.navigate().to("https://nt-dev.noodletools.com/logon/signin");
	driver.navigate().back();
	driver.navigate().forward();
	

}
}