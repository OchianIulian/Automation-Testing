package dataProviders;

import org.testng.annotations.DataProvider;

public class SignUpPageDataProvider {
    /**
     * Data provider for checking compatible browsers
     * @return
     */
    @DataProvider(name="signUpPageDataProvider")
    public Object[][] signUpDataProvider(){
        return new Object[][]{
                {"chrome", true},
                {"safari", true},
                {"firefox", false}
        };
    }
}
