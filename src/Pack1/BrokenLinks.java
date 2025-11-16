package Pack1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
			ChromeDriver  driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//			SoftAssert a = new SoftAssert();
			for(WebElement link: links) {
				String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
			    HttpURLConnection	conn = (HttpURLConnection)new URL(url).openConnection();
			    conn.setRequestMethod("HEAD");
			    conn.connect();
			    int responseCode = conn.getResponseCode();
			   	System.out.println(responseCode);
//			   	Assert.assertTrue(responseCode<400, "The link with Text "+ link.getText()+ "is broken with code" + responseCode );
			   	if(responseCode> 400) {
			   		System.out.println("The link with Text "+ link.getText()+ "is broken with code" + responseCode);
			   		Assert.assertTrue(false);
//			   		a.assertTrue(responseCode<400, "The link with text"+link.getText()+"is broken with code"+ responseCode);
			   	}
			
			}
			
			
			
			
			
			
			//Broken Links
			// Step 1 - IS to get all urls, tied up to the links using Selenium
			// Java methods will call URL's and gets you the status code
			//	If status code > 400 then that url is not working -> link which tied to url is broken
		   //Scan all the links
			// should not stop - cover all the links
		   
		   
		   
		   
	}

}
