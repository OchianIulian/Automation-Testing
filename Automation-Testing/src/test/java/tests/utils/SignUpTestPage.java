package tests.utils;

import dataProviders.SignUpPageDataProvider;
import org.testng.annotations.Test;
import pages.SignUpPage;

public class SignUpTestPage extends BaseUITest{
    @Test(dataProvider = "signUpPageDataProvider", dataProviderClass = SignUpPageDataProvider.class)
    public void testIfSignUpPageIsAvailable(String browserType, boolean expectedAvailability){
        driver = SeleniumUtils.getDriver(browserType);
        SignUpPage signUpPage = new SignUpPage(driver);
        boolean isPageAvailable = signUpPage.open(pageUnderTestUrl);
    }
}
