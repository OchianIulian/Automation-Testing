package tests.utils;

import org.bouncycastle.oer.its.etsi102941.Url;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

public class BaseUITest {
    public WebDriver driver;
    String url;
    String path;
    String pageUnderTestUrl;
    String browser;
    @BeforeClass
    public void setUp() throws IOException {
        Properties properties = SeleniumUtils.readProperties("src\\test\\resources\\application");
        url = properties.getProperty("url");
        path = properties.getProperty("path");
        browser = properties.getProperty("browser");
        pageUnderTestUrl = url + path;

        System.out.println(pageUnderTestUrl);
        System.out.println(browser);
    }


    @AfterClass
    public void close(){
        //close the browser
//        if(driver != null){
//            driver.quit();
//        }
    }
}
