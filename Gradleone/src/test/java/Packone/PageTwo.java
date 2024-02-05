package Packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
 
class PageTwo
{
    WebDriver driver;
    @BeforeTest
    public void setup() {
        // Set up the wWebDriverManager for chrome driver
        WebDriverManager.chromedriver().setup();
        // Create the driver object
        driver = new ChromeDriver();
    }
 
    @Test
    public void checkTheUrl() {
        // Open the browser and go to lambdatest ecommerce website
        driver.get("https://www.google.com/");
        // Set the current url as a string
        String url = driver.getCurrentUrl();
        System.out.println("Google URL Name : " +url);
        		
        // Verify that current url contains lambdatest
        //Assert.assertTrue(url.contains("lambdatest"));
    }
 
    @AfterTest
    public void teardown() {
       // Close the driver
        //driver.quit();
    }
 
}