package dataProviders;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

    /**
     * Data provider for testing calculator functionalities.
     * @return Object that contains data with the structure (operand1, operator, operand2, expected)
     */
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
