package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        
        // Open Facebook sign-up page
        driver.get("https://www.facebook.com/r.php");

        // Maximize browser window
        driver.manage().window().maximize();

        // Locate dropdowns for Day, Month, and Year
        WebElement dayDropdown = driver.findElement(By.id("day"));
        WebElement monthDropdown = driver.findElement(By.id("month"));
        WebElement yearDropdown = driver.findElement(By.id("year"));

        // Create Select objects
        Select selectDay = new Select(dayDropdown);
        Select selectMonth = new Select(monthDropdown);
        Select selectYear = new Select(yearDropdown);

        // Select values from dropdowns
        selectDay.selectByVisibleText("15");    // Selecting 15th day
        selectMonth.selectByVisibleText("Jun"); // Selecting June
        selectYear.selectByValue("1995");       // Selecting the year 1995

        // Print selected values
        System.out.println("Selected Date: 15 June 1995");

        // Close browser
        driver.quit();

	}

}
