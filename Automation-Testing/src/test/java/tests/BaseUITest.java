package tests;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tests.utils.SeleniumUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Base class for any testing page class
 */
public class BaseUITest {
    public WebDriver driver;
    String url;
    String path;
    String pageUnderTestUrl;
    String browser;

    /**
     * Set up the website.
     * Get the info rom application.properties and create the path to the wanted website.
     * @throws IOException
     */
    @BeforeClass
    public void setUp() throws IOException {
        Properties properties = SeleniumUtils.readProperties("src/test/resources/application.properties");
        url = properties.getProperty("url");
        path = properties.getProperty("path");
        browser = properties.getProperty("browser");
        pageUnderTestUrl = url + path;

        System.out.println(pageUnderTestUrl);
        System.out.println(browser);
    }


    /**
     * Close the opened websites after the tests are finished
     */
    @AfterClass
    public void close(){
        //close the browser
//        if(driver != null){
//            driver.quit();
//        }
    }
}
