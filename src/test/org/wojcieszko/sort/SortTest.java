package test.org.wojcieszko.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.sort.Sort;

import java.util.Arrays;

/**
 * Sort Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>maj 19, 2018</pre>
 */
public class SortTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: random()
     */
    @Test
    public void testRandom() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: bubbleSort()
     */
    @Test
    public void testBubbleSort() throws Exception {
//TODO: Test goes here...

        Sort sort = new Sort();

        sort.random02();

        System.out.println(Arrays.toString(sort.table));

        sort.bubbleSort();

        System.out.println(Arrays.toString(sort.table));

    }


} 
