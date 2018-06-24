package test.org.wojcieszko.digits;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.digits.Digits;

/**
 * Digits Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 24, 2018</pre>
 */
public class DigitsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: nDigits(int number)
     */
    @Test
    public void testNDigits() throws Exception {

        Assert.assertEquals(1, Digits.nDigits(1));
        Assert.assertEquals(1, Digits.nDigits(5));
        Assert.assertEquals(1, Digits.nDigits(9));
        Assert.assertEquals(2, Digits.nDigits(11));
        Assert.assertEquals(3, Digits.nDigits(999));
        Assert.assertEquals(4, Digits.nDigits(1000));

    }

    @Test
    public void testNDigitsMultiply() throws Exception {

        int[] array = {1, 10, 100, 1000, 10000, 100000, 1000000};

        Assert.assertEquals(1, Digits.nDigitsArray(1, array));
        Assert.assertEquals(1, Digits.nDigitsArray(5, array));
        Assert.assertEquals(1, Digits.nDigitsArray(9, array));
        Assert.assertEquals(2, Digits.nDigitsArray(11, array));
        Assert.assertEquals(3, Digits.nDigitsArray(999, array));
        Assert.assertEquals(4, Digits.nDigitsArray(1000, array));

    }

    @Test
    public void testNDigits02() throws Exception {

        int moreTests = 13;
        int count = 100;

        Digits.nDigits(450000);

        for (int j = 0; j < moreTests; ++j) {

            final long startTime = System.nanoTime();

            for (int i = 0; i < count; ++i) {

                Digits.nDigits(1500);

            }

            final long endTime = System.nanoTime();

            final long duration = endTime - startTime;

            System.out.println(duration / count);
        }

    }

    @Test
    public void testNDigits03() throws Exception {

        int moreTests = 13;
        int count = 100;

        Digits.nDigits(450000);

        for (int j = 0; j < moreTests; ++j) {

            final long startTime = System.nanoTime();

            for (int i = 0; i < count; ++i) {

                Digits.nDigitsLog(1500);

            }

            final long endTime = System.nanoTime();

            final long duration = endTime - startTime;

            System.out.println(duration / count);
        }

    }

    @Test
    public void testNDigits04() throws Exception {

        int moreTests = 13;
        int count = 100;

        Digits.nDigits(450000);

        for (int j = 0; j < moreTests; ++j) {

            final long startTime = System.nanoTime();

            for (int i = 0; i < count; ++i) {

                Digits.nDigitsMultiply(1500);

            }

            final long endTime = System.nanoTime();

            final long duration = endTime - startTime;

            System.out.println(duration / count);
        }

    }

    @Test
    public void testNDigits05() throws Exception {

        int[] array = {1, 10, 100, 1000, 10000, 100000, 1000000};

        int moreTests = 13;
        int count = 100;

        Digits.nDigits(450000);

        for (int j = 0; j < moreTests; ++j) {

            final long startTime = System.nanoTime();

            for (int i = 0; i < count; ++i) {

                Digits.nDigitsArray(1500, array);

            }

            final long endTime = System.nanoTime();

            final long duration = endTime - startTime;

            System.out.println(duration / count);
        }

    }

} 
