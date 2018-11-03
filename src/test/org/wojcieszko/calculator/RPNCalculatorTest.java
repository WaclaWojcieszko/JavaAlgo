package test.org.wojcieszko.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.calculator.RPNCalculator;

public class RPNCalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void operate() {

        RPNCalculator calculator = new RPNCalculator();

        String input = "2 1 2 * ^ =";

        calculator.operate(input);

    }
}