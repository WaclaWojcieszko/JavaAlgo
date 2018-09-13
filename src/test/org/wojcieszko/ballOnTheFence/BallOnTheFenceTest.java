package test.org.wojcieszko.ballOnTheFence;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.ballOnTheFence.BallOnTheFence;

/** 
* BallOnTheFence Tester. 
* 
* @author <Authors name> 
* @since <pre>cze 20, 2018</pre> 
* @version 1.0 
*/ 
public class BallOnTheFenceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getFence() 
* 
*/ 
@Test
public void testGetFence() throws Exception {
    int[][] fence = {{1}, {2}, {5}, {3}, {4}};
    BallOnTheFence ballOnTheFence = new BallOnTheFence(fence);

    Assert.assertTrue(fence.equals(ballOnTheFence.getFence()));

}

    @Test
    public void testGetFence02() throws Exception {
        int[][] fence = {{1, 2, 3}, {2, 6, 2}, {1, 1, 5}, {4, 2, 3}, {4, 4, 6}};
        BallOnTheFence ballOnTheFence = new BallOnTheFence(fence);

        Assert.assertTrue(fence.equals(ballOnTheFence.getFence()));

    }

    /**
* 
* Method: setFence(int[][] fence) 
* 
*/ 
@Test
public void testSetFence() throws Exception {

    int[][] fence = {{1}, {2}, {5}, {3}, {4}};
    int[][] fence2 = {{4}, {2}, {8}};
    BallOnTheFence ballOnTheFence = new BallOnTheFence(fence);

    ballOnTheFence.setFence(fence2);

    Assert.assertTrue(fence2.equals(ballOnTheFence.getFence()));

} 

/** 
* 
* Method: fallingBall() 
* 
*/ 
@Test
public void testFallingBall() throws Exception {
    int[][] fence = {{1}, {2}, {5}, {3}, {4}};
    BallOnTheFence ballOnTheFence = new BallOnTheFence(fence);

    ballOnTheFence.fallingBall();

}

    @Test
    public void testFallingBall02() throws Exception {
        int[][] fence = {{1, 2, 3}, {2, 6, 2}, {1, 1, 5}, {4, 2, 3}, {4, 4, 6}};
        BallOnTheFence ballOnTheFence = new BallOnTheFence(fence);

        for (int i = 0; i < fence.length; ++i){
            for (int j = 0; j < fence[0].length; ++j){
                System.out.print(fence[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        ballOnTheFence.fallingBall();

    }


} 
