package dataProviders;

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

    @Test
    public void testAddingPositiveNumbers(){
        System.out.println("Verify that some:" + calculator.compute(4, 5, "+") + "is equal to 9" );
        Assert.assertEquals(calculator.compute(4, 5, "+"), 9); 
    }
}
