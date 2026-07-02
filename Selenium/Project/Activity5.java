package suiteCRM;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity5 {
	WebDriver driver;
    WebDriverWait wait;
    
    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void getNavigationMenuColor() {

        driver.get("https://crm.alchemy.hguy.co/#/Login");

        // Login
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")))
                .sendKeys("admin");

        driver.findElement(By.xpath("//input[@name='password']"))
                .sendKeys("5Nx#I6BK%r3$8vz0ch");

        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        // Wait for the navigation menu
        WebElement navMenu = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".navbar-collapse")));

        // Get background color
        	String bgColor = navMenu.getCssValue("background-color");

        	System.out.println("Background Color (RGBA): " + bgColor);
    	}

    	@AfterMethod
    	public void tearDown() {
        	driver.quit();
    	}
}
