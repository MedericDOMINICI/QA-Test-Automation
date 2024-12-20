// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GotopaymentinfoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void gotopaymentinfo() {
    driver.get("https://www.vr.fi/");
    driver.manage().window().setSize(new Dimension(1550, 830));
    {
      WebElement element = driver.findElement(By.linkText("EN"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("EN")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("from-station-picker")).click();
    driver.findElement(By.id("station-search")).sendKeys("oulu");
    driver.findElement(By.id("stationPickerOption_0")).click();
    driver.findElement(By.id("to-station-picker")).click();
    {
      WebElement element = driver.findElement(By.id("to-station-picker"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("station-search")).sendKeys("rovaniemi");
    driver.findElement(By.id("stationPickerOption_0")).click();
    driver.findElement(By.cssSelector(".TripSearch_searchButton__IRo14")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".DurationTransfers_transferCount__d0p_p > span")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,282.3999938964844)");
    js.executeScript("window.scrollTo(0,875.2000122070312)");
    driver.findElement(By.cssSelector(".vr-button:nth-child(1) > .LocalizedMessages_localizedCurrency__kqeGR")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.findElement(By.cssSelector(".vr-button:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".vr-button:nth-child(2)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("delivery-email-0")).sendKeys("test@test.fi");
    driver.findElement(By.cssSelector("div:nth-child(2) > .form_option__ThAnj > .PaymentMethod_label__9BbF_")).click();
    driver.findElement(By.cssSelector(".vr-button:nth-child(6)")).click();
    driver.findElement(By.id("cardNumber")).click();
    driver.findElement(By.id("cardNumber")).sendKeys("000000000000000");
    driver.findElement(By.id("securityCode")).click();
    driver.findElement(By.id("securityCode")).sendKeys("000");
    driver.findElement(By.id("okButton")).click();
  }
}
