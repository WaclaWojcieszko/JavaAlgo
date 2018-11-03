package test.org.wojcieszko.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.calculator.InfixCalculator;

public class InfixCalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void operate() {

        InfixCalculator calculator = new InfixCalculator();
        calculator.operate("1 + 3 =");

    }

    @Test
    public void operate2() {

        InfixCalculator calculator = new InfixCalculator();
        calculator.operate("(1 + 3) =");

    }
}