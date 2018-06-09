package test.org.wojcieszko.sudoku;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.wojcieszko.sudoku.Sudoku;

/** 
* Sudoku Tester. 
* 
* @author <Authors name> 
* @since <pre>cze 9, 2018</pre> 
* @version 1.0 
*/ 
public class SudokuTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: miniCheck(int idx, int value, int[] board, int[] check) 
* 
*/ 
@Test
public void testMiniCheck() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: check(int idx, int value, int[] board) 
* 
*/ 
@Test
public void testCheck() throws Exception { 

    Sudoku sudoku = new Sudoku();
    int[] board = {
            -1, -1, 1, -1,
            4, -1, -1, -1,
            -1, -1, -1, 2,
            -1, 3, -1, -1};


    System.out.println(sudoku.check(4, 2, board));

    Assert.assertFalse(sudoku.check(0, 1, board));
    Assert.assertFalse(sudoku.check(0, 4, board));
    Assert.assertFalse(sudoku.check(1, 4, board));

}
    @Test

    public void testSolve(){
        Sudoku sudoku = new Sudoku();
        int[] board = {
                -1, -1, 1, -1,
                4, -1, -1, -1,
                -1, -1, -1, 2,
                -1, 3, -1, -1};

        sudoku.solve(board);
    }

} 
