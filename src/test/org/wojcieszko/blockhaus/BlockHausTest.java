package test.org.wojcieszko.blockhaus;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.wojcieszko.blockhaus.BlockHaus;

/**
 * BlockHaus Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 1, 2018</pre>
 */
public class BlockHausTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getBlockHeight()
     */
    @Test
    public void testGetBlockHeight() throws Exception {

        BlockHaus blockHaus = new BlockHaus();
        int[] height = {1, 9, 5, 3, 4};
        blockHaus.setBlockHeight(height);
        blockHaus.viewAnalysis();

    }

    /**
     * Method: setBlockHeight(int[] blockHeight)
     */
    @Test
    public void testSetBlockHeight() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: viewAnalysis()
     */
    @Test
    public void testViewAnalysis() throws Exception {
//TODO: Test goes here... 
    }


} 
