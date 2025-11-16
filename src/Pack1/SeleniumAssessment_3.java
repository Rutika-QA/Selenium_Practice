package Pack1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumAssessment_3 {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup() throws InterruptedException {  
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
        Thread.sleep(3000);  // Added 'throws InterruptedException'
    }
    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.id("SubmitLogin"));

        emailField.sendKeys(username); 
        passwordField.sendKeys(password);  
        loginButton.click();
    }
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
            {"smandape06@gmail.com", "logindata"}
        };
    }
    @AfterClass
    public void afterclass() {
        driver.close();
    }
}
