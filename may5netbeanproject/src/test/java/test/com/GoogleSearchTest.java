/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kulsum
 */
public class GoogleSearchTest {
    private static WebDriver driver;
    
    
    public GoogleSearchTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        // Set Chrome driver path
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
     @Test
    public void testGoogleSearch() {
        // Open Google homepage
        driver.get("https://www.google.com");
        // Find the search input element by its name
        WebElement searchBox = driver.findElement(By.name("q"));
        // Enter a search query
        searchBox.sendKeys("Java Selenium TestNG");
        // Submit the search query
        searchBox.submit();
        // Wait for the results page to load
        // Here, you can implement explicit or implicit waits
        // For simplicity, I'm using a static wait
        try {
            Thread.sleep(3000); // Wait for 3 seconds (not recommended for production use)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if search results are displayed
        WebElement searchResults = driver.findElement(By.id("search"));
        assert searchResults.isDisplayed();
    }
    
    
    
    
}
