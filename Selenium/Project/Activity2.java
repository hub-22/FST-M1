package suiteCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	
	 @BeforeClass
	    public void setUp() {
	        // Initialize Firefox driver
	        driver = new FirefoxDriver();
	        // Open the page
	        driver.get("https://crm.alchemy.hguy.co");
	    }
	 
	 @Test
	    public void printHeaderImageUrl() {

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 WebElement logo = wait.until(
		     ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img"))
		 );
	        // Get the image URL
	        String imageUrl = logo.getAttribute("src");

	        // Print the URL
	        System.out.println("Header Image URL: " + imageUrl);
	        
	    }
	 
	 @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();

	    }  

}
