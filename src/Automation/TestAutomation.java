package Automation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;	

class TestAutomation {

	@Test
	void test_page_title() {
		// Set up Chrome options
		System.setProperty("webdriver.chrome.driver", "/home/mederic/Desktop/Software Quality and testing/chromedriver-linux64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // Optional: maximize the browser window

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Step 1: Navigate to the University of Oulu website
            driver.get("https://www.oulu.fi/university/");
            
            // Step 2: Accept cookies
            WebElement acceptButton = driver.findElement(By.xpath("//button[contains(text(), 'Accept')]"));
            acceptButton.click();

            // Step 3: Get the page title
            String pageTitle = driver.getTitle();
            
            assertEquals("University of Oulu", pageTitle);

            // Step 4: Check if the title matches
            if (pageTitle.equals("University of Oulu")) {
                System.out.println("Test Passed: Title matches.");
            } else {
                System.out.println("Test Failed: Title does not match.");
            }
        } catch (Exception e) {
            System.out.println("Error during test: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
	}
	
	@Test
	void test_thesis_defense() {
		// Set up Chrome options
        System.setProperty("webdriver.chrome.driver", "/home/mederic/Desktop/Software Quality and testing/chromedriver-linux64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");  // Optional: maximize the browser window

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);

        try {
            // Step 1: Navigate to the University of Oulu website
            driver.get("https://www.oulu.fi/university/");
            
            // Step 2: Accept cookies
            WebElement acceptButton = driver.findElement(By.xpath("//button[contains(text(), 'Accept')]"));
            acceptButton.click();

            // Step 3: Wait for the "Thesis defences" text to be visible
            WebDriverWait wait = new WebDriverWait(driver, 10);  // Wait for up to 10 seconds for the page to load
            WebElement thesisDefencesText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'thesis defences')]")));

            // Step 4: Assert that the text is present on the page
            assertNotNull(thesisDefencesText, "Text 'Thesis defences' not found on the page");

            // Optionally, print confirmation
            System.out.println("Test Passed: 'Thesis defences' text found.");
        } catch (Exception e) {
            System.out.println("Error during test: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }	
    }

}
