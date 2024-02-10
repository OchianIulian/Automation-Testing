package tests;

import dataProviders.CalculatorDataProvider;
import org.example.calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTests {
    static Calculator calculator;

    @BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }

    /**
     * Manual test for adding function
     */
    @Test
    public void testAddingPositiveNumbers(){
        System.out.println("Verify that some:" + calculator.compute(4, 5, "+") + "is equal to 9" );
        Assert.assertEquals(calculator.compute(4, 5, "+"), 9);
    }

    /**
     * Test that use a data provider with structure (operand1, operator, operand2, expected)
     */
    @Test(dataProvider = "calculatorPositiveDataProvider", dataProviderClass = CalculatorDataProvider.class )
    public void testPositiveNumbersOperations(double d1, double d2, String operation, double expected){
        Assert.assertEquals(calculator.compute(d1, d2, operation), expected);

    }

}
