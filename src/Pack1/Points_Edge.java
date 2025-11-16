package Pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Points_Edge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		a.moveToElement(driver.findElement(By.cssSelector("textarea[class='gLFyf']"))).build().perform();
		a.moveToElement(driver.findElement(By.id("APjFqb"))).click().sendKeys("Bing.com").sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//a[@href='https://www.bing.com/']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
		WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.id("id_a")));
		profileIcon.click();
		WebElement signInText = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.id_text_signin")));
		// Click the sign-in link
		signInText.click();
		
		WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email, phone, or Skype']")));
		email.sendKeys("rutikamasne1@hotmail.com");
		
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable (By.cssSelector("button[id='idSIButton9']")));
		nextButton.click();
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("i0118")));
		password.sendKeys("Rutika@2000");
		
		WebElement signInBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9")));
		signInBtn.click();
		
		WebElement yesBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		yesBtn.click();
		
		String []  wordsToSearch = {"Labyrinth", "Petrichor","Quintessential", "Sonder","Melancholy", 
				"Euphoria","Petrify", "Ethereal","Limerence", "Umbra", "Solitude", "Incandescent", "Ineffable", "Transcendent",
				"Obfuscate", "Inequity", "Paradox", "Sonorous", "Obelisk", "Resilience", "Soliloquy", "Incantation", "Nostalgia", "Epiphany"};
	// Iterate through each word and perform the search
     for (String word : wordsToSearch) {
         WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='sb_form_q']")));
         searchBox.clear(); // Clear previous text
         searchBox.sendKeys(word);
         searchBox.sendKeys(Keys.ENTER);
         Thread.sleep(5000);
     }
		
		
	
//		
//		
//		
		
		
	}

}
