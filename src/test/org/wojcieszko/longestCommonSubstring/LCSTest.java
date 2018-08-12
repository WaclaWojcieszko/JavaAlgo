package test.org.wojcieszko.longestCommonSubstring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.longestCommonSubstring.LCS;

/**
 * LCS Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>sie 12, 2018</pre>
 */
public class LCSTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findLCS()
     */
    @Test
    public void testFindLCS() throws Exception {

        LCS lcs = new LCS("żwacz", "waciki");


        Assert.assertEquals("wac", lcs.findLCS());

    }

    @Test
    public void testFindLCS2() throws Exception {

        LCS lcs = new LCS("leżanka", "koleżka");


        Assert.assertEquals("leż", lcs.findLCS());

    }

} 
