package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;

public class GoogleSearchTest {
    WebDriver driver;

    /**
     *Before the test starts, the chrome driver is set up
     */
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    /**
     * Opens Chrome browser, accept cookies, search for an input, click on a link and
     * scrolls down the page
     */
    @Test
    public void searchOnGoogle(){
        driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement acceptCookiesBtn = driver.findElement(By.id("L2AGLb"));
        acceptCookiesBtn.click();

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Google atelier digital", Keys.ENTER);

        WebElement googleAtelierulDigitalLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3"));
        googleAtelierulDigitalLink.click();

        WebElement scrollToElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/h2"));
        new Actions(driver).scrollToElement(scrollToElement).perform();
    }
}
