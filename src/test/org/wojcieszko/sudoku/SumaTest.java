package test.org.wojcieszko.sudoku;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.sudoku.Suma;

/**
 * Suma Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 9, 2018</pre>
 */
public class SumaTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: sum(int a, int b)
     */
    @Test
    public void testSum() throws Exception {

        Suma suma = new Suma();

        Assert.assertEquals(18, suma.sum(3, 6));
        Assert.assertEquals(18, suma.sum2(3, 6));
        Assert.assertEquals(25, suma.sum3(3, 7));
        Assert.assertEquals(25, suma.sum4(3, 7));


    }




} 
