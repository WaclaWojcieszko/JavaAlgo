package test.org.wojcieszko.magnets;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.magnets.Magnets;

/**
 * Magnets Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>lip 1, 2018</pre>
 */
public class MagnetsTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getPosition()
     */
    @Test
    public void testGetPosition() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setPosition(int[] position)
     */
    @Test
    public void testSetPosition() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getBoard()
     */
    @Test
    public void testGetBoard() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setBoard(boolean[][] board)
     */
    @Test
    public void testSetBoard() throws Exception {

        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}};
        int[] startPosition = {1, 1};
        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertTrue(board.equals(magnets.getBoard()));


    }

    /**
     * Method: magnetsOn(int[] sequence)
     */

    @Test
    public void testMagnetsOn00() throws Exception {


        boolean[][] board = {{true}};
        int[] startPosition = {0, 0};
        int[] magnetsSequence = {1};
        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(0, magnets.magnetsOn(magnetsSequence));

    }

    @Test
    public void testMagnetsOn() throws Exception {


        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}};
        int[] startPosition = {1, 1};
        int[] magnetsSequence = {4};
        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(1, magnets.magnetsOn(magnetsSequence));

    }

    @Test
    public void testMagnetsOn01() throws Exception {


        boolean[][] board = {
                {true, false, true},
                {false, true, false},
                {true, false, true}};

        int[] startPosition = {1, 1};
        int[] magnetsSequence = {4};
        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(0, magnets.magnetsOn(magnetsSequence));

    }

    @Test
    public void testMagnetsOn02() throws Exception {


        boolean[][] board = {
                {true, false, true},
                {true, true, true},
                {true, true, true}};

        int[] startPosition = {2, 1};
        int[] magnetsSequence = {2};
        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(0, magnets.magnetsOn(magnetsSequence));

    }
    @Test
    public void testMagnetsOn03() throws Exception {


        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, false, true}};

        int[] startPosition = {1, 1};
        int[] magnetsSequence = {2};
        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(0, magnets.magnetsOn(magnetsSequence));

    }

    @Test
    public void testMagnetsOn04() throws Exception {

        boolean[][] board = {
                {true, false, true, true, true},
                {true, true, true, false, true},
                {true, true, true, true, true},
                {false, true, true, true, false}};

        int[] startPosition = {1, 1};
        int[] magnetsSequence = {1};

        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(0, magnets.magnetsOn(magnetsSequence));

    }

    @Test
    public void testMagnetsOn05() throws Exception {

        boolean[][] board = {
                {true, false, true, true, true},
                {true, true, true, false, true},
                {true, true, true, true, true},
                {false, true, true, true, false}};

        int[] startPosition = {1, 1};
        int[] magnetsSequence = {1, 2};

        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(1, magnets.magnetsOn(magnetsSequence));

    }
    @Test
    public void testMagnetsOn06() throws Exception {

        boolean[][] board = {
                {true, false, true, true, true},
                {true, true, true, false, true},
                {true, true, true, true, true},
                {false, true, true, true, false}};

        int[] startPosition = {1, 1};
        int[] magnetsSequence = {1, 2, 3, 4};

        Magnets magnets = new Magnets(board, startPosition);

        Assert.assertEquals(4, magnets.magnetsOn(magnetsSequence));

    }

} 
