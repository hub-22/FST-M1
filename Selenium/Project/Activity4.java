package suiteCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {

	WebDriver driver;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        driver = new FirefoxDriver();

        // Open browser
        driver.get("https://crm.alchemy.hguy.co/#/Login");
        Thread.sleep(10000);
    }

    @Test
    public void loginTest() throws InterruptedException {
        // Find the username and password fields
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

        // Enter credentials
        username.sendKeys("admin");
        password.sendKeys("5Nx#I6BK%r3$8vz0ch");

        // Click login
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        
        // Read login message
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("#/home"));
        Assert.assertTrue(driver.getCurrentUrl().contains("#/home"));
    }
    
    @AfterClass
    public void afterClass() {
        // Close browser
        driver.close();
    }
}
