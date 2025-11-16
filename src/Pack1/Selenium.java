package Pack1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rutika Masne\\Documents\\chromedriver-win64\\chromedriver-win64");
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/login/");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver1.close();
		}
	
	

}
