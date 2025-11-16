package Pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("sdw");
		
		driver.get("http://google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("D://screenshot1.png"));
		
	}

}
