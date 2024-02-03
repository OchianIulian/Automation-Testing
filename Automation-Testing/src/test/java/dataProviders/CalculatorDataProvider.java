package dataProviders;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {
    // Data providers

    @DataProvider(name="calculatorPositiveDataProvider")
    public Object[][] calculatorDataProvider(){
        return new Object[][]{
                {1, 3, "+", 4},
                {1, 3, "-", -3},
                {1, 3, "+", 3},
                {1, 3, "/", 0.333333}
        };
    }


}
