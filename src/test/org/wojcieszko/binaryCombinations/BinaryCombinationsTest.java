package test.org.wojcieszko.binaryCombinations;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.binaryCombinations.BinaryCombinations;

/**
 * BinaryCombinations Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>lip 21, 2018</pre>
 */
public class BinaryCombinationsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: fun3(int ...data)
     */
    @Test
    public void testFun3() throws Exception {
        BinaryCombinations binaryCombinations = new BinaryCombinations();
        binaryCombinations.fun3(1, 5, 20, -1);
    }


} 
