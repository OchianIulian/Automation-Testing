package tests;

import dataProviders.SignUpPageDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import tests.BaseUITest;
import tests.utils.SeleniumUtils;

public class SignUpTestPage extends BaseUITest {

    /**
     * This test tests if a page available on different browsers on your computer.
     * @param browserType is a String
     * @param expectedAvailability is a boolean
     */
    @Test(dataProvider = "signUpPageDataProvider", dataProviderClass = SignUpPageDataProvider.class)
    public void testIfSignUpPageIsAvailable(String browserType, boolean expectedAvailability){
        driver = SeleniumUtils.getDriver(browserType);
        SignUpPage signUpPage = new SignUpPage(driver);
        boolean isPageAvailable = signUpPage.open(pageUnderTestUrl);

        Assert.assertEquals(expectedAvailability, isPageAvailable);
    }
}
