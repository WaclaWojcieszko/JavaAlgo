package test.org.wojcieszko.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.calculator.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void operate() {

        Calculator calculator = new Calculator();

        String input = "2 1 2 * ^ =";

        calculator.operate(input);

    }
}