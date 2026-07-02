package suiteCRM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {

	WebDriver driver;
    WebDriverWait wait;
    
    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @Test
    public void ReadingAdditionalInformation() {
    	driver.get("https://crm.alchemy.hguy.co/#/Login");

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")))
                .sendKeys("admin");

        driver.findElement(By.xpath("//input[@name='password']"))
                .sendKeys("5Nx#I6BK%r3$8vz0ch");

        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        
     // Hover over Leads
        WebElement opportunities = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[normalize-space()='Leads']"))
        );

        Actions actions = new Actions(driver);
        actions.moveToElement(opportunities).pause(Duration.ofSeconds(4)).perform();

        // Click "View Leads"
        WebElement viewLeads = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[normalize-space()='View Leads']")));

        viewLeads.click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        
	        // Get all rows
	        List<WebElement> rows = driver.findElements(
	                By.xpath("//scrm-table) or contains(@class,'evenListRowS1')]"));

	        System.out.println("Lead Name\t\tUser");
	        System.out.println("--------------------------------");

	        int count = Math.min(6, rows.size());

	        for (int i = 0; i < count; i++) {

	            WebElement row = rows.get(i);

	            String leadName = row.findElement(By.xpath("./td[3]//a")).getText();
	            String user = row.findElement(By.xpath("./td[8]//a")).getText();

	            System.out.println(leadName + "\t\t" + user);
	        }
	    }
	    
	    

}
