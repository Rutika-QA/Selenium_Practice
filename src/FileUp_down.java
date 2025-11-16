import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUp_down {

	public static void main(String[] args) {
	 
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		// download
		
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		// upload
		
		WebElement upload = driver.findElement(By.cssSelector("input[type='file]'"));
		upload.sendKeys("C:\\Users\\Rutika Masne\\Downloads\\download.xlsx");
		
		// Edit excel
		
		
		
		// wait for success messge to show up and wait for disappear
		
		By toastLocator = By.cssSelector(".Toastify_toast-body div:nth-child(2");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		
		
		// varify updated excel data showing in web table
		
	}

}
