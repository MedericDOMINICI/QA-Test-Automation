package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationToDuck {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/mederic/Desktop/Software Quality and testing/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com");
        driver.quit();
    }
}
