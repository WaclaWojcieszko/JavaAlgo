package test.org.wojcieszko.nwd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.nwd.NWD;

/**
 * NWD Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sie 12, 2018</pre>
 */
public class NWDTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getNWD()
     */
    @Test
    public void testGetNWD() throws Exception {

        NWD nwd = new NWD(28, 18);

        Assert.assertEquals(2, nwd.getNWD());

    }

    @Test
    public void testGetNWD2() throws Exception {

        NWD nwd = new NWD(16, 16);

        Assert.assertEquals(16, nwd.getNWD());

    }


    @Test
    public void testGetNWD3() throws Exception {

        NWD nwd = new NWD(0, 1);

        Assert.assertEquals(0, nwd.getNWD());


    }


}
