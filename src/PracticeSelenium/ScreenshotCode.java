package PracticeSelenium;

import java.io.File;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCode {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://youtube.com");
		
//		File src = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C://screenshot"));
		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("D:\\PIctures");
//		FileHandler.class(src, dest);
	}

}

// worng code