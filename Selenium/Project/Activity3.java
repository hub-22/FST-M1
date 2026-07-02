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

public class Activity3 {
	WebDriver driver;
	
	 @BeforeClass
	    public void setUp() throws InterruptedException {
	        // Initialize Firefox driver
	        driver = new FirefoxDriver();
	        // Open the page
	        driver.get("https://crm.alchemy.hguy.co");
	        Thread.sleep(1000);
	    }
	 
	 @Test
	    public void printcopyright() {
		 
		 WebElement footerText = driver.findElement(
	                By.cssSelector("a.footer-link:nth-child(1)"));

	        System.out.println("Footer Text: " + footerText.getText());
	    }
	 
	 @AfterClass
	    public void tearDown() {
	        // Close the browser
	        driver.quit();

	    }  

}
