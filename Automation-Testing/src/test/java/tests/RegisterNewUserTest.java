package tests;

import dataProviders.NegativeTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage;
import tests.BaseUITest;
import tests.utils.SeleniumUtils;

public class RegisterNewUserTest extends BaseUITest {
    /**
     * This test opens a SignUp web page and test creating new users with information from negativeSignUpDataProvider
     * @param browserType String
     * @param username String
     * @param password String
     * @param confirmPassword String
     * @param gender String
     * @param firstName String
     * @param lastName String
     * @param email String
     * @param dateOfBirth String
     * @param nationality String
     * @param termsAndConditionSelected String
     * @param expectedUserNameErr String
     * @param expectedPasswordErr String
     * @param expectedConfirmationPasswordErr String
     * @param expectedFirstNameError String
     * @param expectedLastNameError String
     * @param expectedEmailError String
     * @param expectedTermsAndConditionError String
     */
    @Test(dataProvider = "negativeSignUpDataProvider", dataProviderClass = NegativeTestDataProvider.class)
    public void testNegativeSignUp(String browserType, String username, String password, String confirmPassword, String gender,
                                   String firstName, String lastName, String email, String dateOfBirth, String nationality,
                                   boolean termsAndConditionSelected, String expectedUserNameErr, String expectedPasswordErr,
                                   String expectedConfirmationPasswordErr, String expectedFirstNameError, String expectedLastNameError,
                                   String expectedEmailError, String expectedTermsAndConditionError) {

        driver = SeleniumUtils.getDriver(browserType);
        SignUpPage signUpPage = new SignUpPage(driver);


        signUpPage.open(pageUnderTestUrl);

        signUpPage.registerNewUser(username, password, confirmPassword, gender, firstName, lastName, email, dateOfBirth, nationality, termsAndConditionSelected);
        Assert.assertTrue(signUpPage.checkErr(expectedUserNameErr, "username"));
        Assert.assertTrue(signUpPage.checkErr(expectedPasswordErr, "password"));
        Assert.assertTrue(signUpPage.checkErr(expectedConfirmationPasswordErr, "confirmPassword"));
        Assert.assertTrue(signUpPage.checkErr(expectedFirstNameError, "firstName"));
        Assert.assertTrue(signUpPage.checkErr(expectedLastNameError, "lastName"));
        Assert.assertTrue(signUpPage.checkErr(expectedEmailError, "email"));
    }
}